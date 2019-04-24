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
	
	@Test
	public void generating_7900_to_7920_returns_list_of_size_3() {
		
		List<Integer> primeList = testPNG.generate(7900, 7920);

		Assert.assertTrue(primeList.size() == 3);
		
	}
	
	@Test
	public void passing_inversed_range_10_as_starting_1_as_ending_still_returns_2_3_5_and_7() {
		
		List<Integer> primeList = testPNG.generate(10, 1);
		
		Assert.assertTrue(primeList.contains(2));
		Assert.assertTrue(primeList.contains(3));
		Assert.assertTrue(primeList.contains(5));
		Assert.assertTrue(primeList.contains(7));
		
	}
	
	@Test
	public void inveresed_one_to_ten_returns_list_of_size_4() {
		
		List<Integer> primeList = testPNG.generate(10, 1);
		
		Assert.assertTrue(primeList.size() == 4);
		
	}
	
	@Test
	public void generating_negative_range_returns_empty_list() {
		
		List<Integer> primeList = testPNG.generate(-10, -1);
		
		Assert.assertTrue(primeList.size() == 0);
	}
	
	@Test
	public void generating_with_starting_value_negative_ending_value_positive_returns_primes_in_range() {
		
		List<Integer> primeList = testPNG.generate(-10, 10);
		
		Assert.assertTrue(primeList.contains(2));
		Assert.assertTrue(primeList.contains(3));
		Assert.assertTrue(primeList.contains(5));
		Assert.assertTrue(primeList.contains(7));
		
	}
	
	@Test
	public void generating_with_starting_value_negative_10_ending_value_positive_10_returns_list_of_size_4() {
		
		List<Integer> primeList = testPNG.generate(-10, 10);
		
		Assert.assertTrue(primeList.size() == 4);
	}
	
	@Test
	public void generating_with_starting_value_positive_10_ending_value_negative_10_returns_primes_in_range() {
		
		List<Integer> primeList = testPNG.generate(10, -10);
		
		Assert.assertTrue(primeList.contains(2));
		Assert.assertTrue(primeList.contains(3));
		Assert.assertTrue(primeList.contains(5));
		Assert.assertTrue(primeList.contains(7));
		
	}
	
	@Test
	public void generating_with_starting_value_positive_10_ending_value_negative_10_returns_list_of_size_4() {
		
		List<Integer> primeList = testPNG.generate(10, -10);
		
		Assert.assertTrue(primeList.size() == 4);
	}
	
	@Test
	public void generating_100000_to_110000_returns_list_of_size_861() {
		
		List<Integer> primeList = testPNG.generate(100000, 110000);
		
		Assert.assertTrue(primeList.size() == 861);
		
	}
	
	@Test
	public void generating_range_with_no_primes_returns_list_of_size_0() {
		
		List<Integer> primeList = testPNG.generate(8, 10);
		
		Assert.assertTrue(primeList.size() == 0);
		
	}
	
	@Test
	public void generating_same_number_indicated_as_starting_and_ending_returns_that_number_if_prime() {
		
		List<Integer> primeList = testPNG.generate(2, 2);
		
		Assert.assertTrue(primeList.contains(2));
	}
	
	@Test
	public void generating_same_number_indicated_as_starting_and_ending_does_not_return_that_number_if_not_prime() {
		
		List<Integer> primeList = testPNG.generate(6, 6);
		
		Assert.assertFalse(primeList.contains(6));
	}


}
