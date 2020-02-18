package com.capegemini.screen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capegemini.mybook.bean.Book;
import com.capegemini.mybook.util.DatabaseUtil;
import com.capegemini.show.Show;

import com.capegemini.movie.util.*;

public class ScreenDaoImpl implements ScreenDao{
	Connection connection;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	Show show;
	public ScreenDaoImpl()throws SQLException
	 {
		 connection=DatabaseUtil.myconnection();
	 }

	
	@Override
	public Show searchShow(Show show) throws SQLException {
		pst=connection.prepareStatement("select * from movie where show=?");
		pst.setInt(1,showId);
		rs=null;
		rs=pst.executeQuery();
		
		if(rs.next())
		{
			show=null;
			show=new Show();
			
//			show.setIsbn(rs.getInt(1));
//			show.setBook_name(rs.getString(2));
//			show.setCost(rs.getFloat(3));
//			show.setBook_author(rs.getString(4));
//		}
		return show;
	}
		return null;
	}

	@Override
	public String showShow(String theatre) {
		
		return null;
	}

}
