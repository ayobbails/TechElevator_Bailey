package com.techelevator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

@SuppressWarnings("unused")
public class Less20Tests {

	Less20 testClass = new Less20();
	/*
	 * Testing
	 * 1. Test return true if number is 1 less than multiple of 20
	 * 2. Test return false if number is 1 less than multiple of 20
	 * 3. Test return true if number is 2 less than multiple of 20.
	 * 4. Test return false if number is 2 less than a multiple of 20.
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void return_true_number_is_1_less_multiple_20() {
		int n = 39;
		boolean isLessThanMultipleOf20 = testClass.isLessThanMultipleOf20(n);
		assertEquals("should be true but was false", true, isLessThanMultipleOf20);	
	}
	@Test
	public void return_false_number_is_1_less_multiple_20() {
		int n = 53;
		boolean isLessThanMultipleOf20 = testClass.isLessThanMultipleOf20(n);
		assertEquals("should be false but was true", false, isLessThanMultipleOf20);	
	}
	@Test
	public void return_true_number_is_2_less_multiple_20() {
		int n = 78;
		boolean isLessThanMultipleOf20 = testClass.isLessThanMultipleOf20(n);
		assertEquals("should be true but was false", true, isLessThanMultipleOf20);	
	}
	@Test
	public void return_false_number_is_2_less_multiple_20() {
		int n = 97;
		boolean isLessThanMultipleOf20 = testClass.isLessThanMultipleOf20(n);
		assertEquals("should be false but was true", false, isLessThanMultipleOf20);	
	}

}