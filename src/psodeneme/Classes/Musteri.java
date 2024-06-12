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

public class Musteri implements Subject {
    public String adSoyad;
    public int odaSayisi;
    private String tc;
    private List<Observer> observers;

    public Musteri(String adSoyad, int odaSayisi, String tc) {
        this.adSoyad = adSoyad;
        this.odaSayisi = odaSayisi;
        this.tc = tc;
        this.observers = new ArrayList<>();
    }

    public Musteri() {
        this.observers = new ArrayList<>();
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
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
            observer.update("Müşteri bilgisi güncellendi: " + this.toString());
        }
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "adSoyad='" + adSoyad + '\'' +
                ", odaSayisi=" + odaSayisi +
                ", tc='" + tc + '\'' +
                '}';
    }

    public static List<Musteri> getAllMusteriler() {
        List<Musteri> musteriler = new ArrayList<>();
        String sql = "SELECT adSoyad, odaSayisi, tc FROM musteri";

        try (Connection conn = DatabaseHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String adSoyad = rs.getString("adSoyad");
                int odaSayisi = rs.getInt("odaSayisi");
                String tc = rs.getString("tc");
                Musteri musteri = new Musteri(adSoyad, odaSayisi, tc);
                musteriler.add(musteri);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return musteriler;
    }
}
