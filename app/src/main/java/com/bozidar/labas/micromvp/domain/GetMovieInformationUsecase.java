package com.bozidar.labas.micromvp.domain;

import javax.inject.Inject;

/**
 * Created by Bozidar on 08.11.2015..
 */
public class GetMovieInformationUsecase implements Usecase{

    private String movieId;

    @Inject
    public GetMovieInformationUsecase(String movieId){
        this.movieId = movieId;
    }

    @Override
    public void execute() {

    }
}
