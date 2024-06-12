package psodeneme.Classes;

import psodeneme.Interfaces.IOtelOdasi;

public class StandartOda implements IOtelOdasi {
    @Override
    public String getDescription() {
        return "Standart Oda";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}