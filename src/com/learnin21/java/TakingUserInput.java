package com.learnin21.java;

import java.util.Scanner;

public class TakingUserInput {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your First Name: ");
		String firstName=scanner.nextLine();
		// we are accessing the nextLine method here since we want to store 
		// the user input in a String variable
		System.out.println("the First Name that you entered is "+firstName);
		System.out.println("Please enter your age: ");
		int userAge=scanner.nextInt();
		// Now we accessed the nextInt method here since we want to store the
		//value being entered by the user in integer variable
		System.out.println("The age that you have entered is "+userAge);
	}

}
