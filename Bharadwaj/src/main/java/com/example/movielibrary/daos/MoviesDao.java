package com.example.movielibrary.daos;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.movielibrary.contractor.LibraryRepository;
import com.example.movielibrary.models.Director;
import com.example.movielibrary.models.Movie;

@Component
public class MoviesDao implements LibraryRepository {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public MoviesDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// Define SQL queries for your new tables (BB_Directors and BB_Movies).
	private final String SQL_GET_DIRECTORS = "SELECT * FROM BB_Directors";
	private final String SQL_GET_MOVIES = "SELECT * FROM BB_Movies";
	private final String SQL_GET_DIRECTOR_BY_ID = "SELECT * FROM BB_Directors WHERE directorid = ?";
	private final String SQL_GET_MOVIE_BY_ID = "SELECT * FROM BB_Movies WHERE movieid = ?";
	private final String SQL_GET_MOVIES_BY_DIRECTOR_ID = "SELECT * FROM BB_Movies WHERE directorid = ?";
	private final String SQL_ADDMOVIE = "Insert into bb_movies(title,directorid,genre,rating,budget,duration,releaseyear) values (?,?,?,?,?,?,?)";
	private final String SQL_UPMOVIE = "UPDATE bb_movies SET title=?, directorid=?, genre=?, rating=?, budget=?, duration=?, releaseyear=? WHERE movieid=?";
	private final String SQL_DELMOVIE = "delete from bb_movies WHERE movieid=?";

	@Override
	public ArrayList<Director> getAllDirectors() {
		List<Director> directors = jdbcTemplate.query(SQL_GET_DIRECTORS, new BeanPropertyRowMapper<>(Director.class));
		return new ArrayList<>(directors);
	}

	@Override
	public ArrayList<Movie> getAllMovies() {
		List<Movie> movies = jdbcTemplate.query(SQL_GET_MOVIES, new BeanPropertyRowMapper<>(Movie.class));
		return new ArrayList<>(movies);
	}

	@Override
	public Director getDirectorById(int directorId) {
		return jdbcTemplate.queryForObject(SQL_GET_DIRECTOR_BY_ID, new Object[] { directorId },
				new BeanPropertyRowMapper<>(Director.class));
	}

	@SuppressWarnings("deprecation")
	@Override
	public Movie getMovieById(int movieId) {
		return jdbcTemplate.queryForObject(SQL_GET_MOVIE_BY_ID, new Object[] { movieId },
				new BeanPropertyRowMapper<>(Movie.class));
	}

	@Override
	public ArrayList<Movie> getMoviesByDirectorId(int directorId) {
		List<Movie> movies = jdbcTemplate.query(SQL_GET_MOVIES_BY_DIRECTOR_ID, new Object[] { directorId },
				new BeanPropertyRowMapper<>(Movie.class));
		return new ArrayList<>(movies);
	}

	@Override
	public void addmovie(Movie movie) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(SQL_ADDMOVIE, movie.getTitle(), movie.getDirectorid(), movie.getGenre(), movie.getRating(),
				movie.getBudget(), movie.getDuration(), movie.getReleaseyear());
	}

	@Override
	public void savemovie(Movie movie) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(SQL_UPMOVIE, movie.getTitle(), movie.getDirectorid(), movie.getGenre(), movie.getRating(),
				movie.getBudget(), movie.getDuration(), movie.getReleaseyear(), movie.getMovieid());
	}

	@Override
	public void deleteMovie(int movie) {
		jdbcTemplate.update(SQL_DELMOVIE, movie);

	}

	// Implement other methods as needed for your application.
}
