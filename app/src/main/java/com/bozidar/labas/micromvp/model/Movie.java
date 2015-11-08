package com.bozidar.labas.micromvp.model;

/**
 * Created by macbook on 05.11.2015..
 */
public class Movie {

    private String title;
    private int imageResource;

    public Movie(String title, int imageResource){
        this.title = title;
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResource() {
        return imageResource;
    }
}
