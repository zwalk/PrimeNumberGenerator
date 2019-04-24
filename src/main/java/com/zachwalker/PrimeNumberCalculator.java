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
	 * generate is the main public method of PrimeNumberCalculator and will provide the user with one place to input the range
	 * 	and then receive the list of prime numbers back
	 * 
	 *  @param startingValue this is to indicate the starting number of the range to be tested
	 *  @param endingValue this is to indicate the ending number of the range to be tested
	 *  @return the list of prime numbers in the indicated range
	 */

	@Override
	public List<Integer> generate(int startingValue, int endingValue) {
		
		List<Integer> primeList = new ArrayList<Integer>();
		
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
	
	private boolean isPrime(final int value) {
		boolean isPrime = true;
		
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				isPrime = false;
			}
			
			if (! isPrime) {
				break;
			}
			
			if (value / i < i) {
				break;
			}
		}
		
		return isPrime;
	}

}
