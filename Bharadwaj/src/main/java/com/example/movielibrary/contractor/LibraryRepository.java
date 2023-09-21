package com.example.movielibrary.contractor;

import java.util.ArrayList;

import com.example.movielibrary.models.Director;
import com.example.movielibrary.models.Movie;

public interface LibraryRepository {

	ArrayList<Director> getAllDirectors();

	ArrayList<Movie> getAllMovies();

	Director getDirectorById(int directorId);

	Movie getMovieById(int movieId);

	ArrayList<Movie> getMoviesByDirectorId(int directorId);

	void addmovie(Movie movie);

	void savemovie(Movie movie);

	void deleteMovie(int movie);

}
