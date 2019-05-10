package com.movie.Movie.movies.service;

import com.movie.Movie.repository.MovieRepository;
import com.movie.Movie.movies.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    MovieRepository movieRepository;

    @Override
    public void createMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public List<Movie> filterMoviesBy(String filterBy) {
        return  movieRepository.filterMoviesBy(filterBy);
    }

    @Override
    public void editMovie(Movie movie) {


    }

}
