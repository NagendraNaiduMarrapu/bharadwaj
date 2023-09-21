package com.example.movielibrary.models;

public class Movie {
	private int movieid;
	private String title;
	private int directorid;
	private String genre;
	private double rating;
	private int budget;
	private int duration;
	private int releaseyear;

	public Movie() {
		super();
	}

	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", title=" + title + ", directorid=" + directorid + ", genre=" + genre
				+ ", rating=" + rating + ", budget=" + budget + ", duration=" + duration + ", releaseyear="
				+ releaseyear + "]";
	}

	public Movie(int movieid, String title, int directorid, String genre, double rating, int budget, int duration,
			int releaseyear) {
		super();
		this.movieid = movieid;
		this.title = title;
		this.directorid = directorid;
		this.genre = genre;
		this.rating = rating;
		this.budget = budget;
		this.duration = duration;
		this.releaseyear = releaseyear;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDirectorid() {
		return directorid;
	}

	public void setDirectorid(int directorid) {
		this.directorid = directorid;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getReleaseyear() {
		return releaseyear;
	}

	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}

}
