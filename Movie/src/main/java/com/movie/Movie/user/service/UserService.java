package com.movie.Movie.user.service;


import com.movie.Movie.user.enitity.User;

public interface UserService {

    void createUser(User user);

    void login(String email, String password);
}
