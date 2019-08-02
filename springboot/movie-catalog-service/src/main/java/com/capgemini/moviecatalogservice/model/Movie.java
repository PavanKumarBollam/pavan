package com.capgemini.moviecatalogservice.model;

import java.util.List;

public class Movie {
	
	
	private int movieId;
	private int releaseYear;
	private String movieTitle;
	private List<String> casts;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public List<String> getCasts() {
		return casts;
	}
	public void setCasts(List<String> casts) {
		this.casts = casts;
	}
	public Movie(int movieId, int releaseYear, String movieTitle, List<String> casts) {
		super();
		this.movieId = movieId;
		this.releaseYear = releaseYear;
		this.movieTitle = movieTitle;
		this.casts = casts;
	}
	public Movie() {
		super();
	}
	
	
	
	
	
}
