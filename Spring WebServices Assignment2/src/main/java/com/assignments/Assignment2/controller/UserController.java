package com.assignments.Assignment2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignments.Assignment2.validation.UserValidation;

@RestController
	public class UserController {
		private UserValidation uservalidation = new UserValidation();
		
		@GetMapping("/")
		public String showPage() {
			return "Enter UserName and Password!";
		}
		
		@GetMapping("/name/{uname}/password/{pass}")
		public String showUserPage(@PathVariable("uname") String uname, @PathVariable("pass") String pass) {
			if(uservalidation.isUserValid(uname, pass))
				return "Valid User";
			return "Invalid User";
		}

}
