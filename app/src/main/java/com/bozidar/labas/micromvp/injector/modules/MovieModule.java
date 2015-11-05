package com.bozidar.labas.micromvp.injector.modules;

import com.bozidar.labas.micromvp.injector.ActivityScope;
import com.bozidar.labas.micromvp.model.Movie;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bozidar on 06.11.2015..
 */
@Module
public class MovieModule {

    @Provides
    @ActivityScope
    List<Movie> provideMovies(){
        List<Movie> movies = new ArrayList<>(5);
        for(int i = 0; i < 4; i++){
            movies.add(new Movie());
        }
        return movies;
    }
}
