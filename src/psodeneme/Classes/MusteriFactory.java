package psodeneme.Classes;

import psodeneme.Interfaces.IMusteri;

public class MusteriFactory implements IMusteri {
	 @Override
	    public Musteri createMusteri(String adSoyad, int odaSayisi, String tc) {
	        return new Musteri(adSoyad, odaSayisi, tc);
	    }


}
