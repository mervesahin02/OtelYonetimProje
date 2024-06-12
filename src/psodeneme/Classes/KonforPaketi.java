package psodeneme.Classes;

import psodeneme.Interfaces.IOtelOdasi;

public class KonforPaketi extends OdaDecorator {
    public KonforPaketi(IOtelOdasi decoratedOda) {
        super(decoratedOda);
    }

    @Override
    public String getDescription() {
        return decoratedOda.getDescription() + ", Konfor Paketi";
    }

    @Override
    public double getCost() {
        return decoratedOda.getCost() + 50.0;
    }
}