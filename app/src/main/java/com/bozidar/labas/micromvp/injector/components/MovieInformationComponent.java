package com.bozidar.labas.micromvp.injector.components;

import com.bozidar.labas.micromvp.domain.GetMovieInformationUsecase;
import com.bozidar.labas.micromvp.injector.ActivityScope;
import com.bozidar.labas.micromvp.injector.modules.ActivityModule;
import com.bozidar.labas.micromvp.ui.activity.MovieDetailActivity;

import dagger.Component;

/**
 * Created by Bozidar on 11.11.2015..
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = {
        MovieInformationComponent.class,
        ActivityModule.class
})
public interface MovieInformationComponent {
    void inject(MovieDetailActivity activity);

    GetMovieInformationUsecase getMovieInformationUsecase();
}
