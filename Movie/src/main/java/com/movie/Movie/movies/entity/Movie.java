package com.movie.Movie.movies.entity;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "movie")
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "recommendation")
    private String recommendation;

    @Column(name = "rating")
    private int rating;

    @Column(name = "type")
    private String type;
}

