package com.bozidar.labas.micromvp.injector.components;

import com.bozidar.labas.micromvp.MovieApplication;
import com.bozidar.labas.micromvp.injector.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Bozidar on 05.11.2015..
 */
@Singleton @Component(modules = AppModule.class)
public interface AppComponent {
    MovieApplication app();
}
