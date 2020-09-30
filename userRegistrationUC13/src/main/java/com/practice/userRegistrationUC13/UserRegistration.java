package com.practice.userRegistrationUC13;

public class UserRegistration {

	UserRegistrationInterface firstName = (s)->s.matches("[A-Z][a-z]{2,}");
	UserRegistrationInterface lastName = (s)->s.matches("[A-Z][a-z]{2,}");
	UserRegistrationInterface email = (s)->s.matches("[a-zA-Z0-9+_-]+(.[a-zA-Z0-9+_-]*)@([^\\s])+[.][\\w]{1,}([.][\\w]{3,}.?|[.][a-zA-Z]{2}.?)?");
	UserRegistrationInterface phNo = (s)->s.matches("(91)[7-9][0-9]{9}");
	UserRegistrationInterface password = (s)->s.matches("(?=.*[^\\w])(?=.*[0-9])(?=.*[A-Z])[^\\s].{8,}");
	
}
