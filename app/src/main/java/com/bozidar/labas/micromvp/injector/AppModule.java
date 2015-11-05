package com.bozidar.labas.micromvp.injector;

import com.bozidar.labas.micromvp.MovieApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bozidar on 05.11.2015..
 */
@Module
public class AppModule {
    private final MovieApplication movieApplication;

    public AppModule(MovieApplication movieApplication) {
        this.movieApplication = movieApplication;
    }

    @Provides
    @Singleton
    MovieApplication provideMovieApplication(){
        return this.movieApplication;
    }
}
