package com.zachwalker;

import java.util.List;

/**
 * 
 * @author zachwalker
 *
 * Interface that defines the behaviors of a PrimeNumberGenerator
 * 
 * one main method for user to access functionality, indicate range, and receive a list of prime numbers back
 *
 */

public interface PrimeNumberGenerator {
	
	 List<Integer> generate(int startingValue, int endingValue);

}
