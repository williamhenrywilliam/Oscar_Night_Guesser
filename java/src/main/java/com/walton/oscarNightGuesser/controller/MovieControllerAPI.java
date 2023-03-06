package com.walton.oscarNightGuesser.controller;

import com.walton.oscarNightGuesser.model.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/movies")
public class MovieControllerAPI {

    @Value("${KEY}")
    private String KEY;


    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "")
    public List<Movie> getFirstTenMovies(){

        String apiUrl = "https://api.themoviedb.org/3/discover/movie?api_key=" + KEY + "&language=en-US&with_original_language=en&with_awards=true&vote_count.gte=100&sort_by=vote_average.desc&primary_release_date.gte=2022-01-01";

        // Use the RestTemplate to make a request to the TMDb API for the first 10 popular movies
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> response = restTemplate.getForObject(apiUrl, Map.class);

        // Extract the list of movies from the response
        List<Map<String, Object>> movies = (List<Map<String, Object>>) response.get("results");

        // Create a list to hold the Movie objects
        List<Movie> movieList = new ArrayList<>();

        // Iterate over the list of movies and create a new Movie object for each one
        for (Map<String, Object> movieData : movies) {
            String title = (String) movieData.get("title");
            String posterPath = (String) movieData.get("poster_path");
            String posterUrl = "https://image.tmdb.org/t/p/w500" + posterPath;

            Movie movie = new Movie();
            movie.setMovieTitle(title);
            movie.setPosterImage(posterUrl);

            // Add the Movie object to the list
            movieList.add(movie);
        }

        // Return the list of Movie objects
        return movieList;
    }



}
