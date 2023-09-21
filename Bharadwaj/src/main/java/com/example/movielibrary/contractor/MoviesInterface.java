package com.example.movielibrary.contractor;

import java.util.ArrayList;

import com.example.movielibrary.models.Movie;

public interface MoviesInterface {
	public ArrayList<Movie> getMovies();

	public void addMovie(Movie movie);

	public void deleteMovie(int id);

	public void updateMovie(Movie movie);

	public ArrayList<Movie> getMoviesByDirectorId(int directorId);
}
