package com.techelevator;

import java.util.Scanner;

// Write a command line program which prompts the user for an integer value 
// and display the Fibonacci sequence leading up to that number.

// By definition, the first two numbers in the Fibonacci 
// sequence are 0 and 1, and each subsequent number is the sum of the previous two.

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

// Please enter the Fibonacci number: 25

// 0, 1, 1, 2, 3, 5, 8, 13, 21

// 

public class Fibonacci {

	public static void main(String[] args) {
	
	Scanner theKeyboard = new Scanner(System.in);
	System.out.println("Please enter the Fibonacci number");
	aLine = theKeyboard.hasNextLine();
	
	for (int i = 1; )
		
	}
}

/*
* Sample logic for Fibonacci problem

* 1. Get the upper limit for the sequence from the user.
* 2. Define a variable to hold the previously processed loop value
* 3. Display a zero which is always the first number in the sequence
* 4. Loop from 1 to the limit value 

    (the for loop variable is the current loop value)
    (NOTE:  DO NOT CODE AN INCREMENT IN THE for STATEMENT)  

*     e.g. for (int i; condition;)

*    a. Display the current loop value (you may need to include a ' , ' somewhere too)
*    
*    b. Create a variable to hold the sum of the current loop value and the previous loop value
*    
*    c. Remember the current loop value in the variable that is holding the previously processed loop value
*    
*    d. Set the loop variable to the sum of the previous loop value + current loop value (step b)

*/