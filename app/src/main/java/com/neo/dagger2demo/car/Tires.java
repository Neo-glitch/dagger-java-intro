package com.neo.dagger2demo.car;

import android.util.Log;

public class Tires {
    // we don't own this class(3rd party lib) so can't inject the constructor.

    private static final String TAG = "Tires";

    public Tires() {
    }

    public void inflate(){
        Log.d(TAG, "inflating tires");
    }
}
