package com.capegemini.theatre.dao;

import com.capegemini.movie.Movie;

public interface TheatreDao {
	public Movie searchMovie(String theatre);
	public Movie searchScreen(String theatre);
	

}
