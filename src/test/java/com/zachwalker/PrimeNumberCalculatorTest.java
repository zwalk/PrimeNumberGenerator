package com.zachwalker;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeNumberCalculatorTest {
	
	//PrimeNumberGenerator to complete testing with
	private PrimeNumberGenerator testPNG;
	
	@Before
	public void setup() {
		
		testPNG = new PrimeNumberCalculator();
		
	}
	
	@Test
	public void one_to_ten_returns_list_that_contains_two_three_five_and_seven() {
		
		List<Integer> primeList = testPNG.generate(1, 10);
		
		List<Integer> correctPrimeList = new ArrayList<Integer>();
		correctPrimeList.add(2);
		correctPrimeList.add(3);
		correctPrimeList.add(5);
		correctPrimeList.add(7);
		
		Assert.assertTrue(primeList.equals(correctPrimeList));

		
	}
	
	@Test
	public void one_to_ten_returns_list_of_size_4() {
		
		List<Integer> primeList = testPNG.generate(1, 10);
		
		Assert.assertTrue(primeList.size() == 4);
		
	}
	
	@Test
	public void generating_7900_to_7920_returns_7901_7907_7919() {
		
		List<Integer> primeList = testPNG.generate(7900, 7920);
		
		List<Integer> correctPrimeList = new ArrayList<Integer>();
		correctPrimeList.add(7901);
		correctPrimeList.add(7907);
		correctPrimeList.add(7919);
		
		Assert.assertTrue(primeList.equals(correctPrimeList));

		
	}
	
	@Test
	public void generating_7900_to_7920_returns_list_of_size_3() {
		
		List<Integer> primeList = testPNG.generate(7900, 7920);

		Assert.assertTrue(primeList.size() == 3);
		
	}
	
	@Test
	public void passing_inversed_range_10_as_starting_1_as_ending_still_returns_2_3_5_and_7() {
		
		List<Integer> primeList = testPNG.generate(10, 1);
		
		List<Integer> correctPrimeList = new ArrayList<Integer>();
		correctPrimeList.add(2);
		correctPrimeList.add(3);
		correctPrimeList.add(5);
		correctPrimeList.add(7);
		
		Assert.assertTrue(primeList.equals(correctPrimeList));
		
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
		
		List<Integer> correctPrimeList = new ArrayList<Integer>();
		correctPrimeList.add(2);
		correctPrimeList.add(3);
		correctPrimeList.add(5);
		correctPrimeList.add(7);
		
		Assert.assertTrue(primeList.equals(correctPrimeList));
		
		
	}
	
	@Test
	public void generating_with_starting_value_negative_10_ending_value_positive_10_returns_list_of_size_4() {
		
		List<Integer> primeList = testPNG.generate(-10, 10);
		
		Assert.assertTrue(primeList.size() == 4);
	}
	
	@Test
	public void generating_with_starting_value_positive_10_ending_value_negative_10_returns_primes_in_range() {
		
		List<Integer> primeList = testPNG.generate(10, -10);
		
		List<Integer> correctPrimeList = new ArrayList<Integer>();
		correctPrimeList.add(2);
		correctPrimeList.add(3);
		correctPrimeList.add(5);
		correctPrimeList.add(7);
		
		Assert.assertTrue(primeList.equals(correctPrimeList));
		
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
	public void generating_same_number_indicated_as_starting_and_ending_returns_list_of_size_1_if_prime() {
		
		List<Integer> primeList = testPNG.generate(2, 2);
		
		Assert.assertTrue(primeList.size() == 1);
	}
	
	@Test
	public void generating_same_number_indicated_as_starting_and_ending_does_not_return_that_number_if_not_prime() {
		
		List<Integer> primeList = testPNG.generate(6, 6);
		
		Assert.assertFalse(primeList.contains(6));
	}
	
	@Test
	public void generating_same_number_indicated_as_starting_and_ending_returns_list_of_size_0_if_not_prime() {
		
		List<Integer> primeList = testPNG.generate(6, 6);
		
		Assert.assertTrue(primeList.size() == 0);
	}
	
	@Test
	public void generating_80_to_100_returns_list_containing_83_89_and_97() {
		List<Integer> primeList = testPNG.generate(80, 100);
		
		List<Integer> correctPrimeList = new ArrayList<Integer>();
		correctPrimeList.add(83);
		correctPrimeList.add(89);
		correctPrimeList.add(97);
		
		Assert.assertTrue(primeList.equals(correctPrimeList));

	}
	
	@Test
	public void generating_includes_both_start_and_endpoint_returns_them_if_prime() {
		
		List<Integer> primeList = testPNG.generate(13, 47);
		
		
		Assert.assertTrue(primeList.contains(13));
		Assert.assertTrue(primeList.contains(47));
		
	}
	
	@Test
	public void generating_0_to_102_returns_first_26_prime_numbers() {
		
		List<Integer> primeList = testPNG.generate(0, 102);
		
		List<Integer> correctPrimeList = new ArrayList<Integer>();
		correctPrimeList.add(2);
		correctPrimeList.add(3);
		correctPrimeList.add(5);
		correctPrimeList.add(7);
		correctPrimeList.add(11);
		correctPrimeList.add(13);
		correctPrimeList.add(17);
		correctPrimeList.add(19);
		correctPrimeList.add(23);
		correctPrimeList.add(29);
		correctPrimeList.add(31);
		correctPrimeList.add(37);
		correctPrimeList.add(41);
		correctPrimeList.add(43);
		correctPrimeList.add(47);
		correctPrimeList.add(53);
		correctPrimeList.add(59);
		correctPrimeList.add(61);
		correctPrimeList.add(67);
		correctPrimeList.add(71);
		correctPrimeList.add(73);
		correctPrimeList.add(79);
		correctPrimeList.add(83);
		correctPrimeList.add(89);
		correctPrimeList.add(97);
		correctPrimeList.add(101);
		
		Assert.assertTrue(primeList.equals(correctPrimeList));
	
	}
	
	@Test
	public void generate_0_0_does_not_return_null_list() {
		
		List<Integer> primeList = testPNG.generate(0, 0);
		
		Assert.assertNotNull(primeList);
	}


}
