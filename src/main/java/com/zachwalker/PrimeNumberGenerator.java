package com.zachwalker;

import java.util.List;

public interface PrimeNumberGenerator {
	
	 List<Integer> generate(int startingValue, int endingValue);
	 boolean isPrime(int value);

}
