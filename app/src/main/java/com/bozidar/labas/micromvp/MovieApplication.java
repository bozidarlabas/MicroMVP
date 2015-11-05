package com.bozidar.labas.micromvp;

import android.app.Application;

import com.bozidar.labas.micromvp.injector.AppComponent;
import com.bozidar.labas.micromvp.injector.AppModule;
import com.bozidar.labas.micromvp.injector.DaggerAppComponent;

/**
 * Created by Bozidar on 05.11.2015..
 */
public class MovieApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
       appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
