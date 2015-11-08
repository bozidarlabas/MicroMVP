package com.bozidar.labas.micromvp.ui.mvp.presenter;

import com.bozidar.labas.micromvp.ui.mvp.view.MovieView;

/**
 * Created by Bozidar on 05.11.2015..
 */
public interface Presenter {
    void attachView(MovieView v);
    void goToDetailsActivity();
}
