package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class testNonStart {

	NonStart testClass = new NonStart();
	
	/*
	 * Testing
	 * 1. 2 Strings given are concatenated with the first char of each missing
	 * 2. 2 Strings given are concatenated with the second char of each missing
	 * 3. .. given are concatenated with the third char of each missing
	 * 4. .. given are concatenated with no chars missing
	 * 5. .. given are concatenated in reverse order with first char of each missing
	 * 6. .. given are concatenated with the last char of each missing
	 * 
	 */
	
	
	@Test
	public void two_Strings_concat_with_first_char_of_each_missing() {
		String a = "Randy";
		String b = "Struts";
		String getPartialString = testClass.getPartialString(a, b);
		assertEquals("expected strings concatenated with first char missing from each", "andytruts", getPartialString);
	}
	@Test
	public void two_Strings_concat_with_second_char_of_each_missing() {
		String a = "Tank";
		String b = "Thomas";
		String getPartialString = testClass.getPartialString(a, b);
		assertEquals("returned strings concatenated with second char missing from each when should be first", "ankhomas", getPartialString);
	}
	@Test
	public void two_Strings_concat_with_third_char_of_each_missing() {
		String a = "Dominios";
		String b = "Papa";
		String getPartialString = testClass.getPartialString(a, b);
		assertEquals("returned Strings concatenated with third char missing from each when should be first", "ominiosapa", getPartialString);
	}
	@Test
	public void two_Strings_returned_with_no_chars_missing() {
		String a = "Frank";
		String b = "Reynolds";
		String getPartialString = testClass.getPartialString(a, b);
		assertEquals("String returned with no chars missing", "rankeynolds", getPartialString);
	}
	@Test
	public void two_Strings_concat_with_first_char_of_each_missing_in_reverse_order() {
		String a = "Clam";
		String b = "Chowder";
		String getPartialString = testClass.getPartialString(a, b);
		assertEquals("first char of each string is missing but in reverse order", "lamhowder", getPartialString);
	}
	@Test
	public void two_Strings_concat_with_last_char_of_each_missing() {
		String a = "Klaus";
		String b = "Cringle";
		String getPartialString = testClass.getPartialString(a, b);
		assertEquals("String returned with chars missing from end of Strings", "lausringle", getPartialString);
	}
}
