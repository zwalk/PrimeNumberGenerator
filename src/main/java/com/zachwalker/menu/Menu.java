package com.zachwalker.menu;

import java.util.List;
import java.util.Scanner;

public class Menu {
	
	//scanner to accept user input from the command line
	private final Scanner in = new Scanner(System.in);
	
	/**
	 * An instructional welcome message to give the user more context when the application opens
	 */
	public void displayWelcomeMessage() {
		
		System.out.println("Hello! Welcome to Zach Walker's Prime Number Generator.");
		System.out.println("All you need to do is let me know the range of numbers that you would like to test");
		System.out.println("and I will output your primes from lowest value to highest value! Have Fun!");
		System.out.println();
	}
	
	/**
	 * A friendly goodbye message for a user that has completed the function of the program
	 */
	public void displayGoodbyeMessage() {
		
		System.out.println();
		System.out.println();
		System.out.println("Thank you for using ZW Prime Gen 1.0, have a Prime day!");
	}
	
	
	/**
	 * displayPrimeNumbers takes in a list of integers and displays them to the user, if list is empty, messages that to user
	 * 
	 * @param primeList list of integers
	 */
	public void displayPrimeNumbers(List<Integer> primeList) {
		
		if (primeList.size() != 0) {
			
			System.out.print("The primes in your range are...");
			
			System.out.println();
			
			for (int prime : primeList) {
				System.out.print(prime + " ");
			}
			
		} else {
			
			System.out.print("There are no prime numbers in that range!");
			
		}
		

	}
	
	/**
	 * this method asks the user to input the starting number of their range that they want to test
	 * 
	 * @return Object, but supported by private methods to validate user input, only an Object that 
	 * can be cast as an integer will be returned
	 */
	public Object askUserForStartingNumber() {
		
		System.out.print("Please enter the starting number of your range >>>  ");
		
		return waitForNumberFromUser();
	}
	
	/**
	 * this method asks the user to input the ending number of their range that they want to test
	 * 
	 * @return Object, but supported by private methods to validate user input, only an Object that 
	 * can be cast as an integer will be returned
	 */
	public Object askUserForEndingNumber() {
		
		System.out.print("Please enter the ending number of your range >>>  ");
		
		return waitForNumberFromUser();
	}
	
	/**
	 * waitForNumberFromUser is a while loop that waits for the correct input to come from the user
	 * @return object choice, which can be cast as an integer since it has been validated
	 */
	private Object waitForNumberFromUser() {
		
		Object choice = null;
		
		while(choice == null) {
			choice = getNumberFromUser();
		}
		
		return choice;
	}
	
	/**
	 * getNumberFromUser accepts the input from the user and then checks to see if it is a valid integer, if not, the user is asked
	 * to please try again until an integer is provided
	 * 
	 * @return choice as an Object that can be safely cast to an integer
	 */
	private Object getNumberFromUser() {
		
		Object choice = null;
		
		String userInput = in.nextLine();
		System.out.println();
		
		try {
			choice = Integer.valueOf(userInput);
			
		} catch(NumberFormatException e) {
			//if caught, choice remains null and user will be asked again.
			
			System.out.println("*** " + userInput + " is not a valid number ***");
			System.out.println();
			System.out.print("Please Provide a Valid Number >>>  ");
		}
		
		return choice;
		
	}

}
