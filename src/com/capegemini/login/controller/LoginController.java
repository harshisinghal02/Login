package com.capegemini.login.controller;

public class LoginController {

	public void CotrolPage(String user)
	{
		if(user.equals("admin"))
		{
			AdminPage admin=new AdminPage();
			admin.show();
		}

		else if(user.equals("user"))
		{
			UserPage user=new UserPage();
			user.show();
		}
	}
}
