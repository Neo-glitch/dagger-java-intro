package com.neo.dagger2demo.car;

import android.app.Application;

import com.neo.dagger2demo.dagger.AppComponent;
import com.neo.dagger2demo.dagger.DaggerAppComponent;
import com.neo.dagger2demo.dagger.DriverModule;


public class ExampleApp extends Application {
    // ensure to update manifest with needed code to make this work

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.factory()
                .create(new DriverModule("Neo"));

    }

    // to access this component outside of this class
    public AppComponent getAppComponent(){
        return component;
    }
}
