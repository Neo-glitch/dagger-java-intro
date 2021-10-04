package com.neo.dagger2demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.neo.dagger2demo.car.Car;
import com.neo.dagger2demo.car.ExampleApp;
import com.neo.dagger2demo.dagger.ActivityComponent;
import com.neo.dagger2demo.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // use DaggerComponent.create() only if no runtime param is needed to be passed to a module, else do it this way
//        CarComponent carComponent = DaggerCarComponent.builder()
//                .dieselEngineModule(new DieselEngineModule(100))
//                .build();

//        //here, we use our customComponent builder
//        CarComponent carComponent = DaggerCarComponent.builder()
//                .horsePower(150)
//                .engineCapacity(1400)
//                .build();

        // using activity component that requires a dependency found in app level component after exposing the method to get the dependency
//        ActivityComponent component = DaggerActivityComponent.builder()
//                .horsePower(150)
//                .engineCapacity(1400)
//                .appComponent(((ExampleApp)getApplication()).getAppComponent())
//                .build();

////        // gets the activity subcomponent from app component using the getActivityComponent fun def previously
//        ActivityComponent component =((ExampleApp)getApplication()).getAppComponent()
//                .getActivityComponentBuilder()
//                .horsePower(150)
//                .engineCapacity(1500).build();

        // gets Activity Subcomponent from app component using getActivityComponent fun def for factory
        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponentFactory()
                .create(140, 1500);

        component.inject(this);

//        car = carComponent.getCar();
        car1.drive();
        car2.drive();
    }
}