package com.bozidar.labas.micromvp.ui.mvp.presenter.impl;

import com.bozidar.labas.micromvp.ui.mvp.presenter.Presenter;
import com.bozidar.labas.micromvp.ui.mvp.view.View;

import javax.inject.Inject;

/**
 * Created by Bozidar on 05.11.2015..
 */
public class MovieListPresenter implements Presenter {

    private View movieView;

    @Inject
    public MovieListPresenter() {
    }

    @Override
    public void attachView(android.view.View v) {
        this.movieView = (View) v;
    }
}
