package com.movie.Movie.user.repository;

import com.movie.Movie.user.enitity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface UserRepository extends JpaRepository<User, BigDecimal> {

    boolean auth(String email, String hashedPassword);
}
