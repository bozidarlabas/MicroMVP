package com.bozidar.labas.micromvp.injector.modules;

import com.bozidar.labas.micromvp.model.Movie;
import com.bozidar.labas.micromvp.ui.mvp.presenter.Presenter;
import com.bozidar.labas.micromvp.ui.mvp.presenter.impl.MovieListPresenter;

import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bozidar on 08.11.2015..
 */
@Module
public class PresenterModule {

    @Provides
    public Presenter provideMovielistPresenter(List<Movie> movies){
        return new MovieListPresenter(movies);
    }
}
