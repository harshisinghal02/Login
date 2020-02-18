package com.capegemini.screen.dao;

import java.sql.SQLException;

import com.capegemini.show.Show;

public interface ScreenDao  {
	
	public String showShow(String theatre);
	public Show searchShow(Show show) throws SQLException;

}
