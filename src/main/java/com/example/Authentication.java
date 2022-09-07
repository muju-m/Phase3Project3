package com.example;

public class Authentication {
	public String Auth(String user, String pass) {
		if(user == pass) {
			return "Login Successful";
		}
		else if(user=="" || pass == "") {
			return "Enter the username or password";
		}
		else {
			return "Login Failed";
		}
		
	}
}
