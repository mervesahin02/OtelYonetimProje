package psodeneme.Classes;

import psodeneme.Interfaces.IPersonel;

public class PersonelFactory implements IPersonel {
	@Override
    public Personel createPersonel(String adSoyad, int persId, int calismaSaati, int maas) {
        return new Personel(adSoyad, persId, calismaSaati, maas);
    }

}
