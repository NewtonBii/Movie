package com.movie.Movie.movies.service;

import com.movie.Movie.movies.entity.Movie;

import java.util.List;

public interface MovieService {
    void createMovie(Movie movie);

    List<Movie> filterMoviesBy(String filterBy);

    void editMovie(Movie movie);

    void deleteMovie(Movie movie);
}
