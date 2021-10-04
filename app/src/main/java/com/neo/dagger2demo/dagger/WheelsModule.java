package com.neo.dagger2demo.dagger;


import com.neo.dagger2demo.car.Rims;
import com.neo.dagger2demo.car.Tires;
import com.neo.dagger2demo.car.Wheels;

import dagger.Module;
import dagger.Provides;

// modules used to inject and get instance of 3rd party lib
@Module
public class WheelsModule {

    // to provide rims for us
    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tires tires){
        // passes the params rims and tires gotten using provides method
        return new Wheels(rims, tires);
    }
}
