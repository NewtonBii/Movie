package com.movie.Movie.repository;

import com.movie.Movie.movies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface MovieRepository extends JpaRepository<Movie, BigDecimal> {
}
