package com.example.NesneProje.NesneProje;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import psodeneme.Classes.KonforPaketi;
import psodeneme.Classes.StandartOda;
import psodeneme.Interfaces.IOtelOdasi;

public class OdaDecoratorTest {

    @Test
    public void testStandartOda() {
        IOtelOdasi oda = new StandartOda();
        assertEquals("Standart Oda", oda.getDescription());
        assertEquals(100.0, oda.getCost(), 0.01);
    }

    @Test
    public void testKonforPaketi() {
        IOtelOdasi oda = new StandartOda();
        oda = new KonforPaketi(oda);
        assertEquals("Standart Oda, Konfor Paketi", oda.getDescription());
        assertEquals(150.0, oda.getCost(), 0.01);
    }
}
