package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateFashionTests {

	/*
	 * Define an object for the class
	 * with the methods to test 
	 */
	
	DateFashion testClass = new DateFashion();
	
	/*
	 * Testing
	 * 
	 * 1. Test both you and date 8 or above style
	 * 2. Test both you and date 2 or below
	 * 3. Test you above 8 or more and date 2 or less.
	 * 4. Test you and date 3 or more and 7 or less.
	 * 
	 * 
	 */
	
	@Test
	public void both_you_and_date_8_and_above() {
		int you = 8;
		int date = 8;
		int getATable = testClass.getATable(you,date);
		assertEquals("Get a table", 2, getATable);
	}
	@Test
	public void you_and_date_2_or_below() {
		int you = 1;
		int date = 2;
		int getATable = testClass.getATable(you,date);
		assertEquals("No table for you", 0, getATable);
	}
	@Test
	public void you_and_date_7_and_3_inclusive() {
		int you = 7;
		int date = 3;
		int getATable = testClass.getATable(you,date);
		assertEquals("Maybe get a table", 1, getATable);
	}
	@Test
	public void you_8_and_date_2_or_below() {
		int you = 8;
		int date = 2;
		int getATable = testClass.getATable(you,date);
		assertEquals("No table for you", 0, getATable);
	}
}
