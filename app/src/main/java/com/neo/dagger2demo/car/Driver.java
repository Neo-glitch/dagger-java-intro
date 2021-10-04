package com.neo.dagger2demo.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;


public class Driver {
    private static final String TAG = "Driver";
    // we don't own the class, so can't use the inject constructor

//    // dependency to be a singleton
//
//    @Inject
//    public Driver(){
//
//    }

    String driverName;


    public Driver(@Named("driverName") String driverName) {
        this.driverName = driverName;
        showDriverName();
    }


    //    @Inject
    public void showDriverName(){
        Log.d(TAG, "The driver's name is: " + driverName);
    }


}
