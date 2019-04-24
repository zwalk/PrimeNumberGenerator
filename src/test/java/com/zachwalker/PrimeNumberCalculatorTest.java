package com.zachwalker;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeNumberCalculatorTest {
	
	private PrimeNumberGenerator testPNG;
	
	@Before
	public void setup() {
		
		testPNG = new PrimeNumberCalculator();
		
	}
	
	@Test
	public void one_to_ten_returns_list_that_contains_two_three_five_and_seven() {
		
		List<Integer> primeList = testPNG.generate(1, 10);
		
		Assert.assertTrue(primeList.contains(2));
		Assert.assertTrue(primeList.contains(3));
		Assert.assertTrue(primeList.contains(5));
		Assert.assertTrue(primeList.contains(7));
		
	}
	
	@Test
	public void one_to_ten_returns_list_of_size_4() {
		
		List<Integer> primeList = testPNG.generate(1, 10);
		
		Assert.assertTrue(primeList.size() == 4);
		
	}
	
	@Test
	public void generating_7900_to_7920_returns_7901_7907_7919() {
		
		List<Integer> primeList = testPNG.generate(7900, 7920);
		
		Assert.assertTrue(primeList.contains(7901));
		Assert.assertTrue(primeList.contains(7907));
		Assert.assertTrue(primeList.contains(7919));
		
	}

}
