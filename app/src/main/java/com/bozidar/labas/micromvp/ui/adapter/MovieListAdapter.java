package com.bozidar.labas.micromvp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bozidar.labas.micromvp.R;
import com.bozidar.labas.micromvp.model.Movie;
import com.bozidar.labas.micromvp.ui.listener.RecyclerClickListener;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Bozidar on 05.11.2015..
 */
public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder> {

    private List<Movie> movies;
    private final RecyclerClickListener recyclerClickListener;
    private Context context;

    public MovieListAdapter(List<Movie> movies, Context context, RecyclerClickListener recyclerClickListener) {
        this.movies = movies;
        this.context = context;
        this.recyclerClickListener = recyclerClickListener;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.movie_item, parent, false);
        return new MovieViewHolder(rootView, recyclerClickListener);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.bindMovie(movies.get(position));
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.tv_item_movie_title)
        TextView tvMovieTitle;

        @Bind(R.id.iv_item_movie_header)
        ImageView ivMovieHeader;

        public MovieViewHolder(View itemView, RecyclerClickListener recyclerClickListener) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            bindListener(itemView, recyclerClickListener);
        }

        private void bindListener(View itemView, final RecyclerClickListener recyclerClickListener) {
            itemView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    recyclerClickListener.onElementClick(getPosition());
                }
            });
        }

        public void bindMovie(Movie movie) {
            tvMovieTitle.setText(movie.getTitle());

            Glide.with(context)
                    .load(movie.getImageResource())
                    .into(ivMovieHeader);
        }
    }
}
