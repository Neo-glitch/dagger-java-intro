package com.neo.dagger2demo.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine{
    // class to implement the dependency which is an interface

    private static final String TAG = "PetrolEngine";

    // to show alt way of passing runtime values like that of DieselEngine
    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horsePower") int horsePower, @Named("engineCapacity") int engineCapacity){
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "petrol engine started. " +
                "\nHorsePower: " + horsePower +
                "\nEngine: " + engineCapacity);
    }
}
