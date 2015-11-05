package com.bozidar.labas.micromvp.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bozidar.labas.micromvp.MovieApplication;
import com.bozidar.labas.micromvp.R;
import com.bozidar.labas.micromvp.model.Movie;
import com.bozidar.labas.micromvp.ui.adapter.MovieListAdapter;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MovieListActivity extends AppCompatActivity {

    @Bind(R.id.recycler_view_movies)
    RecyclerView recyclerViewMovies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_list);
        ButterKnife.bind(this);

        initializeRecyclerView();
        initializeDependencyInjector();
        showMovieList(mockMovies());
    }

    private void initializeDependencyInjector() {
        MovieApplication movieApplication = (MovieApplication) getApplication();
        movieApplication.getAppComponent().inject(this);
    }

    private void showMovieList(ArrayList<Movie> movies) {
        MovieListAdapter movieListAdapter = new MovieListAdapter(movies, this);
        recyclerViewMovies.setAdapter(movieListAdapter);
    }

    private ArrayList<Movie> mockMovies() {
        ArrayList<Movie> movies = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            movies.add(new Movie());
        }
        return movies;
    }

    private void initializeRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewMovies.setLayoutManager(linearLayoutManager);
    }
}
