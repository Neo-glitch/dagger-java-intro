package com.neo.dagger2demo.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{

    private static final String TAG = "DieselEngine";

    // value to be injected to this var at runtime
    private int horsePower;


    // without passing horsePower var to be assigned val at runtime, this works like normal
//    @Inject
//    public DieselEngine(){
//    }


    @Inject
    public DieselEngine(int horsePower){  // gets integer value from provides method in module
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "diesel engine started. Horsepower: " + horsePower);
    }
}
