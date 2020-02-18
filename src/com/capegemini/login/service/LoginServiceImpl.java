package com.capegemini.login.service;

public class LoginServiceImpl implements LoginService{

	@Override
	public void userLogin() {
		
		System.out.println("Re Enter Password");
		
		if(!console.readLine().equlas(login.getPassword()))
		{
			System.err.println("ReEnter Password is wrong");
			System.out.println("Re Enter Password again");
			
		}

		}
		
		
	}


