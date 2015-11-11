package com.bozidar.labas.micromvp.injector.modules;

import com.bozidar.labas.micromvp.domain.GetMovieInformationUsecase;
import com.bozidar.labas.micromvp.injector.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bozidar on 11.11.2015..
 */
@Module
public class MovieInformationModule {
    private final String movieId;

    public MovieInformationModule(String movieId){
        this.movieId = movieId;
    }

    @Provides @ActivityScope
    GetMovieInformationUsecase provideMovieInformation(){
        return new GetMovieInformationUsecase(movieId);
    }


}
