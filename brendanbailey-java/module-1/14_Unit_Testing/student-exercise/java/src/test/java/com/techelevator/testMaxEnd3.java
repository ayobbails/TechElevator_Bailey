package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class testMaxEnd3 {

	MaxEnd3 testClass = new MaxEnd3();
	
	/*
	 * Testing
	 * 1. FIRST element in array is LARGER return changed array with all elements changed to that element
	 * 2. LAST element in an array is LARGER return changed array with all elements changed to that element
	 * 3. FIRST element in array is LARGER return changed array with last ELEMENT as ALL elements.
	 * 4. LAST element in array is LARGER return changed array with all elements SET to FIRST element in array
	 * 5. MIDDLE element in array is LARGEST return changed array with all elements set to MIDDLE element
	 * 6. FIRST element in array is SMALLER return changed array with all elements changed to FIRST element.
	 * 7. LAST element in array is SMALLER return changed array with all elements changed to LAST element.
	 * 
	 */
	
	@Test
	public void first_element_larger_return_all_as_first() {
		int[] nums = new int[3];
		nums[0] = 5;
		nums[1] = 44;
		nums[2] = 1;
		int[] test = testClass.makeArray(nums);
		assertArrayEquals("returned array should be three of the first element",new int[]{5,5,5},test);
	}
	@Test
	public void last_element_larger_return_all_as_last() {
		int[] nums = new int[3];
		nums[0] = 5;
		nums[1] = 1;
		nums[2] = 34;
		int[] test = testClass.makeArray(nums);
		assertArrayEquals("returned array should be three of the last element",new int[]{34,34,34},test);
	}
	@Test
	public void first_element_larger_return_all_as_last() {
		int[] nums = new int[3];
		nums[0] = 67;
		nums[1] = 22;
		nums[2] = 34;
		int[] test = testClass.makeArray(nums);
		assertArrayEquals("expecting three of the first element not three of last",new int[]{67,67,67},test);
	}
	@Test
	public void last_element_larger_return_all_as_first() {
		int[] nums = new int[3];
		nums[0] = 23;
		nums[1] = 1;
		nums[2] = 78;
		int[] test = testClass.makeArray(nums);
		assertArrayEquals("expecting array to be three of last element not three of first",new int[]{78,78,78},test);
	}
	@Test
	public void middle_element_larger_return_all_as_middle() {
		int[] nums = new int[3];
		nums[0] = 5;
		nums[1] = 56;
		nums[2] = 34;
		int[] test = testClass.makeArray(nums);
		assertArrayEquals("array returned was three of middle element not first or last",new int[]{34,34,34},test);
	}
	@Test
	public void first_element_smaller_return_all_as_first() {
		int[] nums = new int[3];
		nums[0] = 9;
		nums[1] = 1;
		nums[2] = 34;
		int[] test = testClass.makeArray(nums);
		assertArrayEquals("expecting array to be three elements of last array but recieved three of first",new int[]{34,34,34},test);
	}
	@Test
	public void last_element_smaller_return_all_as_first() {
		int[] nums = new int[3];
		nums[0] = 94;
		nums[1] = 1;
		nums[2] = 23;
		int[] test = testClass.makeArray(nums);
		assertArrayEquals("returned array should be three of the first element but returned three of last",new int[]{94,94,94},test);
	}
}
