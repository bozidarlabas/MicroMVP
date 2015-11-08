package com.bozidar.labas.micromvp.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bozidar.labas.micromvp.MovieApplication;
import com.bozidar.labas.micromvp.R;
import com.bozidar.labas.micromvp.injector.AppModule;
import com.bozidar.labas.micromvp.injector.components.DaggerMovieComponent;
import com.bozidar.labas.micromvp.injector.modules.ActivityModule;
import com.bozidar.labas.micromvp.model.Movie;
import com.bozidar.labas.micromvp.ui.adapter.MovieListAdapter;
import com.bozidar.labas.micromvp.ui.mvp.presenter.Presenter;
import com.bozidar.labas.micromvp.ui.mvp.view.MovieView;

import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MovieListActivity extends AppCompatActivity implements MovieView{

    @Bind(R.id.recycler_view_movies)
    RecyclerView recyclerViewMovies;

    @Inject
    Presenter movieListPresenter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_list);
        ButterKnife.bind(this);

        initializeRecyclerView();
        initializeDependencyInjector();
        initializePresenter();
    }

    private void initializePresenter() {
        movieListPresenter.attachView(this);
    }

    private void initializeDependencyInjector() {
        MovieApplication movieApplication = (MovieApplication) getApplication();

        DaggerMovieComponent.builder()
                .activityModule(new ActivityModule(this))
                .appModule(new AppModule(movieApplication))
                .build().inject(this);
    }



    private void initializeRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewMovies.setLayoutManager(linearLayoutManager);
    }


    @Override
    public void showMovieList(List<Movie> movies) {
        MovieListAdapter movieListAdapter = new MovieListAdapter(movies, this);
        recyclerViewMovies.setAdapter(movieListAdapter);
    }
}
