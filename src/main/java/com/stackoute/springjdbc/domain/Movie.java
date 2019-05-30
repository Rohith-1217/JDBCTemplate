package com.stackoute.springjdbc.domain;

public class Movie {
private int movieid;
private String moviename;
private int movieyear;
private int rating;
public Movie()
{

}

    public Movie(String moviename,int movieid) {
        this.movieid = movieid;
        this.moviename = moviename;
    }

    public Movie(int movieid, String moviename, int movieyear, int rating) {
        this.movieid = movieid;
        this.moviename = moviename;
        this.movieyear = movieyear;
        this.rating = rating;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public int getMovieyear() {
        return movieyear;
    }

    public void setMovieyear(int movieyear) {
        this.movieyear = movieyear;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieid=" + movieid +
                ", moviename='" + moviename + '\'' +
                ", movieyear=" + movieyear +
                ", rating=" + rating +
                '}';
    }
}
