package com.movie.Movie.movies.controller;


import com.movie.Movie.movies.service.MovieService;
import com.movie.Movie.movies.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;


@RestController
@RequestMapping(name = "v1/movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    /*
Add movie: Title, Description, Recommendation, Rating , Type(Movies, Series)
Filter movies (all, watched, unwatched)
Edit movie
Delete movie

*/
    @PostMapping(value = "createMovie")
    public ResponseEntity createMovie(@RequestBody() Movie movie) {
        try {
            movieService.createMovie(movie);

        } catch (Exception e) {

            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        }
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value = "filterMovies")
    public List<Movie> filterMovies(@RequestParam(value = "watched", required = false) String watched) {
        try {
            List<Movie> movies = movieService.filterMoviesBy(watched);
            if (movies.isEmpty()) {
                return null;
            } else {
                return movies;
            }
        } catch (Exception e) {
            return null;
        }

    }

    public ResponseEntity editMovie(@RequestBody() Movie movie) {
        try {
            movieService.editMovie(movie);

        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity(HttpStatus.CREATED);
    }


}
