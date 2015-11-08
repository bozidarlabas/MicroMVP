package com.bozidar.labas.micromvp.injector.modules;

import com.bozidar.labas.micromvp.R;
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
        List<Movie> movies = new ArrayList<>(6);
        movies.add(new Movie("Paperman", R.drawable.paperman));
        movies.add(new Movie("Godfather", R.drawable.godfather));
        movies.add(new Movie("Hunger Games", R.drawable.hunger_games));
        movies.add(new Movie("Interstellar", R.drawable.interstellar));
        movies.add(new Movie("Whiplash", R.drawable.whiplash));
        movies.add(new Movie("Redemption", R.drawable.redemtion));
        return movies;
    }
}
