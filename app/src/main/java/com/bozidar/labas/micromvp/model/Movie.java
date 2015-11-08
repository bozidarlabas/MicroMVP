package com.bozidar.labas.micromvp.model;

/**
 * Created by macbook on 05.11.2015..
 */
public class Movie {

    private String title;
    private int imageResource;
    private String id;

    public Movie(String title, int imageResource, String id) {
        this.title = title;
        this.imageResource = imageResource;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getId() {
        return id;
    }
}
