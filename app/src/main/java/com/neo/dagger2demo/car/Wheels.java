package com.neo.dagger2demo.car;

public class Wheels {
    // we don't own this class(3rd party lib) so can't inject the constructor.

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
