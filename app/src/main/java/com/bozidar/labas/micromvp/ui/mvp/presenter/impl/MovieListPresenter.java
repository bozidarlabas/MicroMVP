package com.bozidar.labas.micromvp.ui.mvp.presenter.impl;

import com.bozidar.labas.micromvp.model.Movie;
import com.bozidar.labas.micromvp.ui.mvp.presenter.Presenter;
import com.bozidar.labas.micromvp.ui.mvp.view.MovieView;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Bozidar on 05.11.2015..
 */
public class MovieListPresenter implements Presenter {

    private final List<Movie> movies;
    private MovieView movieView;

    @Inject
    public MovieListPresenter(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public void attachView(MovieView v) {
        this.movieView = (MovieView) v;
        movieView.showMovieList(movies);
    }
}
