package com.example.movielibrary.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.example.movielibrary.contractor.LibraryRepository;
import com.example.movielibrary.models.Director;
import com.example.movielibrary.models.Movie;

@Repository
@Primary
public class LibraryRepositoryImpl implements LibraryRepository {

	private final LibraryRepository libraryRepository;

	@Autowired
	public LibraryRepositoryImpl(LibraryRepository libraryRepository) {
		this.libraryRepository = libraryRepository;
	}

	@Override
	public ArrayList<Director> getAllDirectors() {
		return libraryRepository.getAllDirectors();
	}

	@Override
	public ArrayList<Movie> getAllMovies() {
		return libraryRepository.getAllMovies();
	}

	@Override
	public Director getDirectorById(int directorId) {
		return libraryRepository.getDirectorById(directorId);
	}

	@Override
	public Movie getMovieById(int movieId) {
		return libraryRepository.getMovieById(movieId);
	}

	@Override
	public ArrayList<Movie> getMoviesByDirectorId(int directorId) {
		return libraryRepository.getMoviesByDirectorId(directorId);
	}

	@Override
	public void addmovie(Movie movie) {
		// TODO Auto-generated method stub
		libraryRepository.addmovie(movie);
	}

	@Override
	public void savemovie(Movie movie) {
		// TODO Auto-generated method stub
		libraryRepository.savemovie(movie);
	}

	@Override
	public void deleteMovie(int movie) {
		// TODO Auto-generated method stub
		libraryRepository.deleteMovie(movie);
	}

}
