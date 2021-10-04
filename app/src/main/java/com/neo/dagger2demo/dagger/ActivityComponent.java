package com.neo.dagger2demo.dagger;


import com.neo.dagger2demo.MainActivity;
import com.neo.dagger2demo.car.Car;
import com.neo.dagger2demo.car.DieselEngine;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

// module is used to get instance of 3rd party classes for injection where needed by dagger
// where activity gets obj that they want to use(injector)
// our activity component


//@Component(dependencies = AppComponent.class, modules = {WheelsModule.class, PetrolEngineModule.class})
// changed to subComponent to access all things(graph) of parent component(appComponent)
@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

//    // rather than using the default .builder, we define ours for the component, needed when using PetrolEngine Module
//    @Component.Builder
//    @Subcomponent.Builder
//    interface Builder{
//
//        @BindsInstance
//        Builder horsePower(@Named("horsePower") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);
//
//
//        // if we used the default builder, then no needed doing this.since auto done for us(not needed in subComponent implementation)
////        Builder appComponent(AppComponent appComponent);
//        ActivityComponent build();  // to ret a carComponent(must be specified in a custom builder)
//
//    }

    // alt to using a component builder
    @Subcomponent.Factory
    interface Factory{

        ActivityComponent create(@BindsInstance @Named("horsePower") int horsePower,
                                 @BindsInstance @Named("engineCapacity") int engineCapacity);
    }
}
