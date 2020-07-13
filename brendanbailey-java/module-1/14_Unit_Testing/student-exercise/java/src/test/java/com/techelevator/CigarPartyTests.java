package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CigarPartyTests {
	
	// Define an object for the class with the methods to test
	
	CigarParty testClass = new CigarParty(); // instantiate an object for the class with methods to test // Act
	
	/*	
	 * 	Testing
	 * 	
	 * 	Need 40 to 60 cigars unless its weekend, at least 40
	 * 
	 * 	1. Test having 40 cigars and its not a weekend
	 * 	2. Test having 40 cigars and it is a weekend
	 * 	
	 * 	4. Test having 60 cigars and it IS a weekend
	 * 	5. Test having less 40 cigars and it is not a weekend
	 *  6. Test having less 40 cigars and it IS a weekend
	 *  7. Test having more than 60 cigars and it IS a weekend
	 *  8. Test having more than 60 cigars and it is NOT a weekend
	 *  9. Test have between 40 and 60 cigars and it IS a weekend
	 *  10.Test having between 40 and 60 cigars and it is NOT a weekend
	 * 
	 * Junit-method(message-if-fail, expected-result, method-to-test(params);
	 * 
	 */

	@Test
	public void having_40_cigars_and_not_weekend() {
		boolean result = testClass.haveParty(40,false);
		assertEquals("Expected true but was false", true, result);
	}
	@Test
	public void having_40_cigars_and_is_weekend() {
		boolean result = testClass.haveParty(40, true);
		assertEquals("Expected true but was false", true, result);
	}
	@Test
	public void having_60_cigars_and_weekend() {
		boolean result = testClass.haveParty(60, true);
		assertEquals("Expected true but was false", true, result);
	}
	@Test
	public void having_less_40_cigars_and_weekend() {
		boolean result = testClass.haveParty(15, true);
		assertEquals("Expected false but was true", false, result);
	}
	@Test
	public void having_less_40_cigars_and_not_weekend() {
		boolean result = testClass.haveParty(20, false);
		assertEquals("Expected false but was true", false, result);
	}
	@Test
	public void having_more_60_cigars_and_not_weekend() {
		boolean result = testClass.haveParty(70, false);
		assertEquals("Expected false but was true", false, result);
	}
	@Test
	public void having_more_60_cigars_and_weekend() {
		boolean result = testClass.haveParty(71, true);
		assertEquals("Expected true but was false", true, result);
	}
	@Test
	public void having_40_60_cigars_and_weekend() {
		boolean result = testClass.haveParty(40, true);
		assertEquals("Expected true but was false", true, result);
	}
	@Test
	public void having_40_60_cigars_and_not_weekend() {
		boolean result = testClass.haveParty(59, false);
		assertEquals("Expected true but was false", true, result);
	}
}

