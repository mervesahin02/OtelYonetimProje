package psodeneme.Classes;


public class Main {
    public static void main(String[] args) {
        Raporlar rapor = new Raporlar();

        for (Musteri musteri : Musteri.getAllMusteriler()) {
            musteri.addObserver(rapor);
            musteri.setTc(musteri.getTc());
        }

        for (Personel personel : Personel.getAllPersonel()) {
            personel.addObserver(rapor);
            personel.setPers_id(personel.getPers_id()); 
        }
    }
}