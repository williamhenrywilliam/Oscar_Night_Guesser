package com.walton.oscarNightGuesser.model;

public class Movie {

    private String movieTitle;
    private String posterImage;

    public Movie(String movieTitle, String posterImage) {
        this.movieTitle = movieTitle;
        this.posterImage = posterImage;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getPosterImage() {
        return posterImage;
    }

    public void setPosterImage(String posterImage) {
        this.posterImage = posterImage;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", posterImage='" + posterImage + '\'' +
                '}';
    }

}
