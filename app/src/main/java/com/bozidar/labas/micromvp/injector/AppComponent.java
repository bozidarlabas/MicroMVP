package com.bozidar.labas.micromvp.injector;

import com.bozidar.labas.micromvp.ui.activity.MovieListActivity;

import dagger.Component;

/**
 * Created by Bozidar on 05.11.2015..
 */
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MovieListActivity movieListActivity);
}
