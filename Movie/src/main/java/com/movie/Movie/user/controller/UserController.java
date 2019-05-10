package com.movie.Movie.user.controller;


import com.movie.Movie.user.service.UserService;
import com.movie.Movie.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/v1/user/")
public class UserController {

    @Autowired
    UserService userService;


     /*
     * Create-user
Login

*/

    @PostMapping(value = "register")
     public ResponseEntity registerUser(@RequestBody() User user){
         try {
             userService.createUser(user);
         }catch (Exception e){
             return new ResponseEntity(HttpStatus.BAD_REQUEST);
         }

         return new ResponseEntity(HttpStatus.CREATED);
     }
}
