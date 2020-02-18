package com.capegemini.theatre;

import java.util.Arrays;

import com.capegemini.movie.Movie;
import com.capegemini.screen.Screen;

public class Theatre {
	
	private int theatreId;
	private String theatreName;
	private String theatreCity;
	Movie[] movies;
	Screen[] listOfScreens;
	private String managerName;
	private String managerContact;
	public Theatre(int theatreId, String theatreName, String theatreCity,
			Movie[] movies, Screen[] listOfScreens, String managerName,
			String managerContact) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.movies = movies;
		this.listOfScreens = listOfScreens;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatreCity() {
		return theatreCity;
	}
	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}
	public Movie[] getMovies() {
		return movies;
	}
	public void setMovies(Movie[] movies) {
		this.movies = movies;
	}
	public Screen[] getListOfScreens() {
		return listOfScreens;
	}
	public void setListOfScreens(Screen[] listOfScreens) {
		this.listOfScreens = listOfScreens;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName="
				+ theatreName + ", theatreCity=" + theatreCity + ", movies="
				+ Arrays.toString(movies) + ", listOfScreens="
				+ Arrays.toString(listOfScreens) + ", managerName="
				+ managerName + ", managerContact=" + managerContact + "]";
	}
	
	
	

}
