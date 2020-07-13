package com.techelevator;

public class FranksArrayExample {
	
	public static void main(String[] args) {  
		
		System.out.println("Welcome to Frank's Array Example Program"); 

		int score1 = 10;
		int score2 = 20;
		int score3 = 30;
		int score4 = 15;  // *added another value*
		
		//  the code is 'tightly coupled' to the data
		//  if the data changes the code has to change
		//  code is better when its 'loosely coupled' using arrays
		//  code should be independent of the data
		
		int sum = score1 + score2 + score3 + score4; // *added score4*
		
		double avg = sum / 4.0; // calculation for average has to be changed with the new value
								// changing '4' to '4.0' prints a double
		
		System.out.println("The avg of the numbers is: " + avg);
	
		int[] scores = new int[3];  // an array of 3 ints
		
		scores[0] = 10; // first element in an array
		scores[1] = 20; // second element in an array
		scores[2] = 30; // third element in an array
	
		// to reference an element in an array: array-name[index]
		
		// int[] scores = new int[3];

		// the array-name gets you to the start of the array
		// the index tells it how many elements to move over
		
		// set up a for loop to process the array from the beginning to the end
		// define a loop variable called i and initialize it to 0 (which is the index of the first element
		// define a loop condition to loop as long as the loop variable does not -
		
		//		exceed the highest index value
		//		array-name.length return the number elements in the array
		//		array-name.length returns the number of elements in the array
		
		//		if an index is specified that is outside of the array you will get a *run-time exception*
				
				// 	the highest valid index for an array is always the 'number-of-elements' - 1
		
		// increment the loop variable at the end of each loop - Use the increment operator (++)
		// 		to add one to the loop variable
		
		for (int i=0; i < scores.length; i++) { // i will go from 0 to the value 2 while in the loop
			
			System.out.println("In the loop - i =" + i + "scores["+i+"")
			
			total = total + scores[i];			// use the loop variable as an index to the array
		
		}

	
	} 
   
}

// For loop
// used to iterate through the loop
// useful when the number of times to loop is known.

// for (int i=0; i < arrayname.length; i++) {

	// i will go from 0 to the last element #
	// reference an element: arrayname[i]

}





















