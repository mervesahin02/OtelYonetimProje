package psodeneme.Classes;

import psodeneme.Interfaces.Observer;

public class Raporlar implements Observer {
    private int rapor_id;

    public int getRapor_id() {
        return rapor_id;
    }

    public void setRapor_id(int rapor_id) {
        this.rapor_id = rapor_id;
    }

    @Override
    public void update(String message) {
        System.out.println("Rapor Güncellemesi: " + message);
    }
}
