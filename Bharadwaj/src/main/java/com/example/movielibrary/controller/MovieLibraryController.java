package com.example.movielibrary.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.movielibrary.contractor.LibraryRepository;
import com.example.movielibrary.models.Director;
import com.example.movielibrary.models.Movie;

@RestController
public class MovieLibraryController {

	@Autowired
	private LibraryRepository libraryRepository;

	// getting all directors
	@GetMapping("/directors")
	public ArrayList<Director> getAllDirectors() {
		return libraryRepository.getAllDirectors();
	}

	@GetMapping("/directors/{directorId}")
	public Director getDirectorById(@PathVariable int directorId) {
		return libraryRepository.getDirectorById(directorId);
	}

	@GetMapping("/movies/{directorId}")
	public ArrayList<Movie> getMoviesByDirectorId(@PathVariable int directorId) {
		System.out.println("movies list");
		return libraryRepository.getMoviesByDirectorId(directorId);
	}

	@RequestMapping(value = "/addmovie", method = RequestMethod.POST)
	public ResponseEntity<Object> createmovie(@RequestBody Movie movie) {
		System.out.println(movie.toString());
		libraryRepository.addmovie(movie);
		return new ResponseEntity<>("Book is created successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/savemovie", method = RequestMethod.PUT)
	public ResponseEntity<Object> savemovie(@RequestBody Movie movie) {
		System.out.println(movie.toString());
		libraryRepository.savemovie(movie);
		return new ResponseEntity<>("Book is created successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/deleteMovie/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteMovie(@PathVariable int directorId) {
		System.out.println(directorId);
		libraryRepository.deleteMovie(directorId);
		return new ResponseEntity<>("Book is created successfully", HttpStatus.CREATED);
	}

}
