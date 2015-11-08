package com.bozidar.labas.micromvp.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bozidar.labas.micromvp.R;
import com.bozidar.labas.micromvp.ui.mvp.view.MovieDetailView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MovieDetailActivity extends AppCompatActivity implements MovieDetailView{


    @Bind(R.id.activity_movie_detail_progress)
    ProgressBar progressBar;
    @Bind(R.id.activity_movie_detail_details)
    TextView tvMovieDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        ButterKnife.bind(this);
    }

    @Override
    public void startLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void stopLoading() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showMovieDetails(String detail) {
        tvMovieDetails.setVisibility(View.VISIBLE);
    }
}
