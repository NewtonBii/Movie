package com.movie.Movie.repository;

import com.movie.Movie.movies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, BigDecimal> {

    @Query(value = "SELECT * FROM movie WHERE watched = :watched UNION " +
            "SELECT * FROM movie WHERE 'A' = :watched", nativeQuery = true)
     List<Movie> filterMoviesBy(String watched);

    @Query(value = "SELECT * FROM movie WHERE ID = :id", nativeQuery = true)
    Movie findById(Integer id);
}
