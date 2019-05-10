package com.movie.Movie.movies.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "MOVIE")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "RECOMMENDATION")
    private String recommendation;

    @Column(name = "RATING")
    private int rating;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "WATCHED")
    private  String watched;
}

