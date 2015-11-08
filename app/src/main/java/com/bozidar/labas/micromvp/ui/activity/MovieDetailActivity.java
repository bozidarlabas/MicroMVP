package com.bozidar.labas.micromvp.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bozidar.labas.micromvp.R;
import com.bozidar.labas.micromvp.ui.mvp.view.MovieDetailView;

public class MovieDetailActivity extends AppCompatActivity implements MovieDetailView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
    }

    @Override
    public void startLoading() {

    }

    @Override
    public void stopLoading() {

    }
}
