package com.bridgelabz.day19.Day19_Java_Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	static boolean isValid(String regex, String userInput) {
		return Pattern.compile(regex).matcher(userInput).matches();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Java Regex Program");
		String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
		System.out.println("Enter User FirstName:");
		String firstName = sc.next();
		System.out.println("Enter User LastName:");
		String lastName = sc.next();
		String emailPattern = "^[a-zA-Z]+[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2})*$";
		System.out.println("Enter User EmailId:");
		String email =sc.next();
		String mobileNumPattern = "^(91)[ ]{1}[6-9]{1}[0-9]{9}$";
	    String mobileNum = "91 8421241594";
		System.out.println("FirstName valid? " + isValid(firstNamePattern, firstName));
		System.out.println("LastName valid? " + isValid(firstNamePattern, lastName));
		System.out.println("Email valid? " + isValid(emailPattern, email));
		System.out.println(isValid(mobileNumPattern, mobileNum));

	}
}
