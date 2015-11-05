package com.bozidar.labas.micromvp.ui.mvp.view;

import com.bozidar.labas.micromvp.model.Movie;

import java.util.List;

/**
 * Created by Bozidar on 05.11.2015..
 */
public interface View {
    void showMoviesList(List<Movie> movies);
}
