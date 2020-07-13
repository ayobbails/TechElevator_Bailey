package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class testFrontTimes {

	FrontTimes testClass = new FrontTimes();
	/*
	 * Testing
	 * 1. Test if first 3 chars are repeated n times.
	 * 2. Test if 2 chars in String and returned twice.
	 * 3. Test if 1 char in String and returned once.
	 * 4. Test if 1 char in String and returned twice.
	 * 5. Test if 2 chars in String and returned thrice.
	 * 6. Test if first 3 chars are not repeated n times.  
	 * 
	 */
	@Test
	public void first_3_chars_repated_n_times() {
		String str = "Google";
		int n = 8;
		String generateString = testClass.generateString(str,n);
		assertEquals("First 3 chars should be repeated n times", "GooGooGooGooGooGooGooGoo", generateString);
	}
	@Test
	public void if_2_chars_in_String_returned_twice() {
		String str = "Go";
		int n = 2;
		String generateString = testClass.generateString(str,n);
		assertEquals("First 2 chars should be repeated twice", "GoGo", generateString);
	}
	@Test
	public void if_one_char_and_returned() {
		String str = "k";
		int n = 1;
		String generateString = testClass.generateString(str,n);
		assertEquals("1 char should be returned", "k", generateString);
	}
	@Test
	public void if_one_char_and_returned_twice() {
		String str = "k";
		int n = 1;
		String generateString = testClass.generateString(str,n);
		assertEquals("expected 1 char returned once but was returned twice", "k", generateString);
	}
	@Test
	public void if_two_chars_and_repeated_three_times() {
		String str = "kk";
		int n = 2;
		String generateString = testClass.generateString(str,n);
		assertEquals("expecting char returned twice but returned 3 times", "kkkk", generateString);
	}
	@Test
	public void if_first_three_chars_are_not_repeated_n_times() {
		String str = "job";
		int n = 3;
		String generateString = testClass.generateString(str,n);
		assertEquals("expecting 3 chars to be repeated n number of times", "jobjobjob", generateString);
	}
}
