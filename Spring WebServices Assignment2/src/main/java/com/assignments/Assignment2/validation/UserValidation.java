package com.assignments.Assignment2.validation;

public class UserValidation {

	public boolean isUserValid(String uname, String pass) {
		if (uname.equalsIgnoreCase("bhuvi") && pass.equalsIgnoreCase("1234"))
			return true;
		return false;
	}

}