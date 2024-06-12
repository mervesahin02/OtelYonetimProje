
package com.example.NesneProje.NesneProje;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import psodeneme.Classes.OtelOdalari;

public class OtelOdalariTest {

    @Test
    public void testConstructorAndGetters() {
        OtelOdalari oda = new OtelOdalari(4, 101, "Deluxe");
        assertEquals(4, oda.kisiSyisi);
        assertEquals(101, oda.getOda_id());
        assertEquals("Deluxe", oda.tur);
    }

    @Test
    public void testSetOda_id() {
        OtelOdalari oda = new OtelOdalari();
        oda.setOda_id(202);
        assertEquals(202, oda.getOda_id());
    }

    @Test
    public void testSetKisiSyisi() {
        OtelOdalari oda = new OtelOdalari();
        oda.kisiSyisi = 3;
        assertEquals(3, oda.kisiSyisi);
    }

    @Test
    public void testSetTur() {
        OtelOdalari oda = new OtelOdalari();
        oda.tur = "Standard";
        assertEquals("Standard", oda.tur);
    }
}

