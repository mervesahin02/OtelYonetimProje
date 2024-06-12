package psodeneme.Classes;

import psodeneme.Interfaces.Observer;
import psodeneme.Interfaces.Subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.database.DatabaseHelper;

public class Personel implements Subject {
    public String adSoyad;
    private int pers_id;
    public int calismaSaati;
    public int maas;
    private List<Observer> observers;

    public Personel() {
        this.observers = new ArrayList<>();
    }

    public Personel(String adSoyad, int pers_id, int calismaSaati, int maas) {
        this.adSoyad = adSoyad;
        this.pers_id = pers_id;
        this.calismaSaati = calismaSaati;
        this.maas = maas;
        this.observers = new ArrayList<>();
    }

    public int getPers_id() {
        return pers_id;
    }

    public void setPers_id(int pers_id) {
        this.pers_id = pers_id;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Personel bilgisi güncellendi: " + this.toString());
        }
    }

    @Override
    public String toString() {
        return "Personel{" +
                "adSoyad='" + adSoyad + '\'' +
                ", pers_id=" + pers_id +
                ", calismaSaati=" + calismaSaati +
                ", maas=" + maas +
                '}';
    }

    public static List<Personel> getAllPersonel() {
        List<Personel> personeller = new ArrayList<>();
        String sql = "SELECT adSoyad, pers_id, calismaSaati, maas FROM personel";

        try (Connection conn = DatabaseHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String adSoyad = rs.getString("adSoyad");
                int pers_id = rs.getInt("pers_id");
                int calismaSaati = rs.getInt("calismaSaati");
                int maas = rs.getInt("maas");
                Personel personel = new Personel(adSoyad, pers_id, calismaSaati, maas);
                personeller.add(personel);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return personeller;
    }
}
