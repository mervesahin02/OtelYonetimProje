package psodeneme.Classes;

import psodeneme.Interfaces.IOtelOdasi;

public abstract class OdaDecorator implements IOtelOdasi {
    protected IOtelOdasi decoratedOda;

    public OdaDecorator(IOtelOdasi decoratedOda) {
        this.decoratedOda = decoratedOda;
    }

    public String getDescription() {
        return decoratedOda.getDescription();
    }

    public double getCost() {
        return decoratedOda.getCost();
    }
}