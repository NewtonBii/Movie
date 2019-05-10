package com.movie.Movie.movies;


import com.movie.Movie.user.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/v1/")
public class MovieController {

     /*
     * Create-user
Login
Add movie: Title, Description, Recommendation, Rating , Type(Movies, Series)
Filter movies (all, watched, unwatched)
Edit movie
Delete movie

*/

     //create user controller
    public User registerUser(@RequestBody() User user){

    }
}
