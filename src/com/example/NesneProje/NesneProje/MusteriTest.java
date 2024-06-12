package com.example.NesneProje.NesneProje;

import org.junit.Test;
import psodeneme.Classes.Musteri;

import static org.junit.Assert.*;

public class MusteriTest {

    @Test
    public void testGetTc() {
        Musteri musteri = new Musteri("Ahmet Yilmaz", 3, "12345678901");
        assertEquals("12345678901", musteri.getTc());
    }

    @Test
    public void testSetTc() {
        Musteri musteri = new Musteri();
        musteri.setTc("98765432100");
        assertEquals("98765432100", musteri.getTc());
    }

    @Test
    public void testConstructor() {
        Musteri musteri = new Musteri("Mehmet Oz", 2, "12312312312");
        assertEquals("Mehmet Oz", musteri.adSoyad);
        assertEquals(2, musteri.odaSayisi);
        assertEquals("12312312312", musteri.getTc());
    }

    @Test
    public void testMusteriyazdir() {
        Musteri musteri = new Musteri("Ali Veli", 1, "11111111111");
        //musteri.musteriyazdir();
        // This test does not assert anything as it prints to the console.
        // To test print statements, you might consider using a library like System Rules.
    }
}
