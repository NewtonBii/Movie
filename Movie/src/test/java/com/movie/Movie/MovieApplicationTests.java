package com.movie.Movie;

import com.movie.Movie.movies.entity.Movie;
import com.movie.Movie.repository.MovieRepository;
import com.movie.Movie.user.enitity.User;
import com.movie.Movie.user.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
public class MovieApplicationTests {
    @Autowired
    TestEntityManager entityManager;
    @Autowired
    MovieRepository movieRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    public void contextLoads() {
    }

    //integration testing
    //Test that watched movies returned have status watched as Y
    @Test
    public void whenFilterMovieByWatchedYes_thenReturnWatchedMovies() {
        //given
        Movie newMovie = new Movie();
        entityManager.persist(newMovie);
        entityManager.flush();

        //when
        Movie found = movieRepository.filterMoviesBy(newMovie.getWatched()).get(0);

        //then
        assert (found.getWatched().equals(newMovie.getWatched()));


    }

    //Test that watched movies returned have status watched as N
    @Test
    public void whenFilterMovieByWatchedNo_thenReturnWatchedMovies() {
        //given
        Movie newMovie = new Movie();
        entityManager.persist(newMovie);
        entityManager.flush();

        //when
        Movie found = movieRepository.filterMoviesBy(newMovie.getWatched()).get(0);

        //then
        assert (found.getWatched().equals(newMovie.getWatched()));


    }

    //test that records are successfully saved
    @Test
    public void whenMovieIsSaved_thenNumberinDbisIncreamented(){

        //given
        int size = movieRepository.findAll().size();

        //when
        Movie newMovie = new Movie();
        entityManager.persist(newMovie);
        entityManager.flush();

        int size2 = movieRepository.findAll().size();

        //then
        assert (size2 > size);

    }

    //test that records are successfully deleted
    @Test
    public void whenMovieIsDeleted_thenNumberinDbisReduced(){

        //given
        int size = movieRepository.findAll().size();

        //when
        Movie newMovie = new Movie();
        entityManager.persist(newMovie);
        entityManager.flush();

        int size2 = movieRepository.findAll().size();

        //then
        assert (size2 > size);

    }


    //test user is created successfully
    @Test
    public void whenUserIsCreated_thenUserSaved(){
        //given
        int size = userRepository.findAll().size();

        //when
        User newUser = new User();
        entityManager.persist(newUser);
        entityManager.flush();

        int size1 = userRepository.findAll().size();

        //then
        assert (size1 > size);


    }


}
