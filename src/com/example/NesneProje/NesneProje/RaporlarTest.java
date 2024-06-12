package com.example.NesneProje.NesneProje;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import psodeneme.Classes.Musteri;
import psodeneme.Classes.Personel;
import psodeneme.Classes.Raporlar;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RaporlarTest {
    
    private Raporlar rapor;

    @BeforeEach
    public void setUp() {
        rapor = new Raporlar();
    }

    @Test
    public void testGetAllMusteriler() {
        List<Musteri> musteriler = Musteri.getAllMusteriler();
        assertNotNull(musteriler, "Müşteri listesi boş olmamalı");
        assertEquals(4, musteriler.size(), "Müşteri sayısı doğru olmalı");
    }

    @Test
    public void testMusteriUpdate() {
        Musteri musteri = new Musteri("Test Kullanıcısı", 1, "12345678901");
        musteri.addObserver(rapor);
        musteri.setTc("10987654321");
        
    }

    @Test
    public void testGetAllPersonel() {
        List<Personel> personeller = Personel.getAllPersonel();
        assertNotNull(personeller, "Personel listesi boş olmamalı");
        assertEquals(3, personeller.size(), "Personel sayısı doğru olmalı");
    }

    @Test
    public void testPersonelUpdate() {
        Personel personel = new Personel("Test Personeli", 1, 40, 3000);
        personel.addObserver(rapor);
        personel.setPers_id(2);
        
    }
}
