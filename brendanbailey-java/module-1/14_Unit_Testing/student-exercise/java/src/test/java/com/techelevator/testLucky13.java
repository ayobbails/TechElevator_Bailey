package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class testLucky13 {
	
	Lucky13 testClass = new Lucky13();
	
	/*
	 * Testing
	 * 1. if array of ints has two "1" element
	 * 2. if array of ints has one "1" element
	 * 3. if array of ints has three "1" element
	 * 4. if array of ints has two "3" element
	 * 5. if array of ints has three "3" elements.
	 * 6. if array of ints has one "3" element.
	 * 7. if array of ints has one "3" element and two "1" elements.
	 * 8. if array of ints has no "1" elements and no "3" elements
	 * 9. if array of ints has two "1" elements and one "3" elements.
	 * 
	 */
	

	@Test
	public void multiple_one_elements() {
	
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 1;
		array[2] = 0;
		boolean test = testClass.getLucky(array);
		assertEquals("should return false there are two 1 elements", false, test);
	}
	@Test
	public void single_one_elements() {
	
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 0;
		array[2] = 0;
		boolean test = testClass.getLucky(array);
		assertEquals("should return false there is a single 1 element", false, test);
	}
	@Test
	public void three_one_elements() {
	
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 1;
		array[2] = 1;
		boolean test = testClass.getLucky(array);
		assertEquals("should return false, three 1 elements", false, test);
	}
	@Test
	public void two_3_elements() {
	
		int[] array = new int[3];
		array[0] = 3;
		array[1] = 0;
		array[2] = 3;
		boolean test = testClass.getLucky(array);
		assertEquals("two 3 elements should return false", false, test);
	}
	@Test
	public void multiple_3_elements() {
	
		int[] array = new int[3];
		array[0] = 3;
		array[1] = 3;
		array[2] = 3;
		boolean test = testClass.getLucky(array);
		assertEquals("should be false with three 3 elements in array", false, test);
	}
	@Test
	public void has_three_3_elements() {
	
		int[] array = new int[3];
		array[0] = 8;
		array[1] = 3;
		array[2] = 0;
		boolean test = testClass.getLucky(array);
		assertEquals("should be false with one 3 element", false, test);
	}
	@Test
	public void one_3_element_two_1_elements() {
	
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 1;
		array[2] = 0;
		boolean test = testClass.getLucky(array);
		assertEquals("did not work", false, test);
	}
	@Test
	public void array_contains_no_1s_and_no_3s() {
	
		int[] array = new int[3];
		array[0] = 32;
		array[1] = 45;
		array[2] = 5;
		boolean test = testClass.getLucky(array);
		assertEquals("should return true no 1s or 3s in array", true, test);
	}





}
