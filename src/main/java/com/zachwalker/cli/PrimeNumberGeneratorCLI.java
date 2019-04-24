package com.zachwalker.cli;

import java.util.List;

import com.zachwalker.PrimeNumberCalculator;
import com.zachwalker.PrimeNumberGenerator;
import com.zachwalker.menu.Menu;

public class PrimeNumberGeneratorCLI {
	
	//menu is to speak to the user from the command line and accept user inputs
	private static final Menu menu = new Menu();
	
	//primeNumberGenerator is the tool to calculate the prime numbers in a given range
	private static final PrimeNumberGenerator primeNumberGenerator = new PrimeNumberCalculator();
	
	public static void main(String[] args) {
		
		menu.displayWelcomeMessage();
		
		int startingValue = (int)menu.askUserForStartingNumber();
		int endingValue = (int)menu.askUserForEndingNumber();
		
		List<Integer> primeList = primeNumberGenerator.generate(startingValue, endingValue);
		
		menu.displayPrimeNumbers(primeList);
		
		menu.displayGoodbyeMessage();
		
	}
	

}
