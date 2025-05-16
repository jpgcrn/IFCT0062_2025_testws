package com.crngetafe.api.IFCT0062_2025_testws.model;

import jakarta.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String director;
    private int year;
    private String synopsis;
    @Column(name="coverurl")
    private String coverURL;

    public Movie() {
    }

    public Movie(Integer id, String title, String director, int year, String synopsis, String coverURL) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.year = year;
        this.synopsis = synopsis;
        this.coverURL = coverURL;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getCoverURL() {
        return coverURL;
    }

    public void setCoverURL(String coverURL) {
        this.coverURL = coverURL;
    }
}
