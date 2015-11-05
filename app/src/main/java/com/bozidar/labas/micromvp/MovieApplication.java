package com.bozidar.labas.micromvp;

import android.app.Application;

import com.bozidar.labas.micromvp.injector.components.AppComponent;

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
      // appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
