package com.capegemini.movie;

import java.time.LocalDate;
import java.util.Arrays;

import com.capegemini.show.Show;

public class Movie {
	
	private int movieId;
	private String movieName;
	Show movieGenre[]; 
	private String movieDirector;
	private int movieLength;
	String languages[];
	
	public Movie(int movieId, String movieName, Show[] movieGenre,
			String movieDirector, int movieLength, String[] languages,
			LocalDate movieReleaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.languages = languages;
		this.movieReleaseDate = movieReleaseDate;
	}
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Show[] getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(Show[] movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public int getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	private LocalDate movieReleaseDate;

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName
				+ ", movieGenre=" + Arrays.toString(movieGenre)
				+ ", movieDirector=" + movieDirector + ", movieLength="
				+ movieLength + ", languages=" + Arrays.toString(languages)
				+ ", movieReleaseDate=" + movieReleaseDate + "]";
	}
	
}
