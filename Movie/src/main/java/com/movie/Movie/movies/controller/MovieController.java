package com.movie.Movie.movies.controller;


import com.movie.Movie.movies.service.MovieService;
import com.movie.Movie.movies.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/v1/movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    /*
    * Create-user
Login
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


}
