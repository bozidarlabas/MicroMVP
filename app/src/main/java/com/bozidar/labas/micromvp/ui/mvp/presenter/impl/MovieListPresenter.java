package com.bozidar.labas.micromvp.ui.mvp.presenter.impl;

import android.content.Context;
import android.content.Intent;

import com.bozidar.labas.micromvp.model.Movie;
import com.bozidar.labas.micromvp.ui.activity.MovieDetailActivity;
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
    private final Context context;

    @Inject
    public MovieListPresenter(List<Movie> movies, Context context) {
        this.movies = movies;
        this.context = context;
    }

    @Override
    public void attachView(MovieView movieView) {
        this.movieView = movieView;
        movieView.showMovieList(movies);
    }

    @Override
    public void goToDetailsActivity() {
        context.startActivity(new Intent(context, MovieDetailActivity.class));
    }
}
