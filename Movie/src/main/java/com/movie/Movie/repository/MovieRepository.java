package com.movie.Movie.repository;

import com.movie.Movie.movies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, BigDecimal> {

    @Query(value = "SELECT * FROM movie WHERE watched = :watched OR watched = NULL", nativeQuery = true)
     List<Movie> filterMoviesBy(String watched);
}
