package com.learnin21.java;

import java.util.Scanner;

public class MakeAStory {
	
	public static void main(String[] args) {
		
    //__Name__ is a __Adjective__ __Noun__ . They are always __Adverb__ __Verb__.
	//Now you have to take inputs from the user for
      /*
       1.Name
       2.Adjective
       3.Noun
       4.Adverb
       5.Verb
       Note : Use the concepts learnt from the previous program
              which was about taking user input.
       */
		
		//Create a Scanner Object
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name=scanner.nextLine();
		// To introduce an age restriction for usage of our program
		System.out.println("Enter your age");
		int age=scanner.nextInt();
		// The below code is needed because nextInt ignores the next 
		//new line , which would mean it would ignore the adjective
		// unless a new do the scanner.nextLine() .
		scanner.nextLine();
		if (age < 13 ) {
			System.out.println("Sorry , not old enough to play this game");
			System.exit(0);
		}
		System.out.println("Please enter the adjective: ");
		String adjective=scanner.nextLine();
		
		
		/* Make sure that couple of words are not allowed
		 to be assigned to the noun variable
		 but also keep prompting the user till they enter
		 a valid input
		 */

		String noun;
		boolean isValidInput;
		do {
	     System.out.println("Please enter the noun: ");
         noun=scanner.nextLine();
		isValidInput= (noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk"));
		if (isValidInput) {
			System.out.println("That language is not allowed, please try again");
		}
		}while(isValidInput);
		System.out.println("Please enter the adverb: ");
		String adverb=scanner.nextLine();
		System.out.println("Please enter the verb: ");
		String verb=scanner.nextLine();
		
		System.out.println("Your Story is :");
	    //__Name__ is a __Adjective__ __Noun__ . They are always __Adverb__ __Verb__.

		System.out.printf("%s is a %s %s.\n",name,adjective,noun);
		System.out.printf("They are always %s %s \n",adverb,verb);
		// we will see later how to close the scanner or any io object the right way in the finally
		// block
		scanner.close();
	}

}
