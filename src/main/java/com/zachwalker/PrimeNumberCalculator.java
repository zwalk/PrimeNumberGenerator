package com.zachwalker;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author zachwalker
 * 
 * PrimeNumberCalculator implements the behaviors of the PrimeNumberGenerator interface.
 * The class is designed to efficiently provide all prime numbers in any given range
 *
 */

public class PrimeNumberCalculator implements PrimeNumberGenerator {
	
	/**
	 * generate(int startingValue, int endingValue) is the main public method of PrimeNumberCalculator and will provide the user with one place to input the range
	 * 	and then receive the list of prime numbers back
	 * 
	 *  @param startingValue this is to indicate the starting number of the range to be tested
	 *  @param endingValue this is to indicate the ending number of the range to be tested
	 *  @return the list of prime numbers in the indicated range
	 */

	@Override
	public List<Integer> generate(int startingValue, int endingValue) {
		
		List<Integer> primeList = new ArrayList<Integer>();
		
		// below intended to switch startingValue and endingValue when input is provided in inverse order
		if (startingValue > endingValue) {
			int saveEndingValue = endingValue;
			endingValue = startingValue;
			startingValue = saveEndingValue;
		}
		
		// primes start at 2, so this allows any range submitted less than to skip not prime possible numbers
		if (startingValue < 2) {
			startingValue = 2;
		}
		
		for (int j = startingValue; j <= endingValue; j++) {
			if (isPrime(j)) {
				primeList.add(j);
			}
		}

		
		return primeList;
	}
	
	/**
	 * 
	 * isPrime supports generate by checking to see if the passed in int is a prime number
	 * 
	 * @param value number to check if it is prime
	 * @return boolean determination if prime
	 */
	
	private boolean isPrime(final int value) {
		boolean isPrime = true;
		
		for (int i = 2; i < value; i++) {
			
			//testing to see if value is divisible evenly by any natural numbers starting at 2
			if (value % i == 0) {
				isPrime = false;
			}
			
			//below condition stops loop once we have determined a number not to be a prime
			if (! isPrime) {
				break;
			}
			
			/*
			 * below condition is to test if we have covered all possible number pairs
			 * for instance, if value = 10, when you get to i = 4, you are beginning to test previous numbers already tested
			 * since 4 / 10 = 2
			 */
			if (value / i < i) {
				break;
			}
		}
		
		return isPrime;
	}

}
