package psodeneme.Classes;

import psodeneme.Interfaces.IOtelOdasi;

public class DenizManzarasi extends OdaDecorator {
    public DenizManzarasi(IOtelOdasi decoratedOda) {
        super(decoratedOda);
    }

    @Override
    public String getDescription() {
        return decoratedOda.getDescription() + ", Deniz Manzarası";
    }

    @Override
    public double getCost() {
        return decoratedOda.getCost() + 30.0;
    }
}