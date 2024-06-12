package com.example.NesneProje.NesneProje;

import org.junit.Test;
import psodeneme.Classes.Personel;
import psodeneme.Classes.PersonelFactory;

import static org.junit.Assert.*;

public class PersonelFactoryTest {

    @Test
    public void testCreatePersonel() {
        PersonelFactory factory = new PersonelFactory();
        Personel personel = factory.createPersonel("Ayşe Kaya", 123, 40, 5000);

        assertNotNull(personel);
        assertEquals("Ayşe Kaya", personel.adSoyad);
        assertEquals(123, personel.getPers_id());
        assertEquals(40, personel.calismaSaati);
        assertEquals(5000, personel.maas);
    }

    @Test
    public void testGetPersId() {
        Personel personel = new Personel("Ahmet Yilmaz", 123, 40, 5000);
        assertEquals(123, personel.getPers_id());
    }

    @Test
    public void testSetPersId() {
        Personel personel = new Personel();
        personel.setPers_id(456);
        assertEquals(456, personel.getPers_id());
    }

    @Test
    public void testConstructor() {
        Personel personel = new Personel("Mehmet Oz", 789, 35, 4500);
        assertEquals("Mehmet Oz", personel.adSoyad);
        assertEquals(789, personel.getPers_id());
        assertEquals(35, personel.calismaSaati);
        assertEquals(4500, personel.maas);
    }
}
