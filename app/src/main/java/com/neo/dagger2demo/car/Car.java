package com.neo.dagger2demo.car;

import android.util.Log;

import com.neo.dagger2demo.dagger.PerActivity;

import javax.inject.Inject;


// works in same way as singleton annnot but with custom scope
@PerActivity
public class Car {

    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels, Driver driver) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    public void drive(){
        engine.start();
        Log.d(TAG, "driving....Driver: " + driver + "car: " + this);
    }

    //method injection(dagger provides the Remote obj and also passes the csr instance too and calls this fun after the constructor is called)
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
}
