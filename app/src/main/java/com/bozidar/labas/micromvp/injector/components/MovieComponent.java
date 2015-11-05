package com.bozidar.labas.micromvp.injector.components;

import com.bozidar.labas.micromvp.injector.ActivityScope;
import com.bozidar.labas.micromvp.injector.AppModule;
import com.bozidar.labas.micromvp.injector.modules.ActivityModule;
import com.bozidar.labas.micromvp.injector.modules.MovieModule;
import com.bozidar.labas.micromvp.ui.activity.MovieListActivity;

import dagger.Component;

/**
 * Created by Bozidar on 06.11.2015..
 */
@ActivityScope
@Component(
        dependencies = AppModule.class,
        modules = {
                MovieModule.class,
                ActivityModule.class
        })
public interface MovieComponent {
    void inject(MovieListActivity activity);
}
