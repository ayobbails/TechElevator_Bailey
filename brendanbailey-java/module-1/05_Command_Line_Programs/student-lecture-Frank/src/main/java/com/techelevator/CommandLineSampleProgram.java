package com.techelevator;

import java.util.Scanner;	// Go get the description of a Scanner

public class CommandLineSampleProgram {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Frank's Command Line Sample Program");
		
		// ------------------------------------------------------
		// Read input from the keyboard
		// ------------------------------------------------------
		// Define a Java Scanner object to represent the keyboard
		// ------------------------------------------------------	
		// System.in is a predefined name for the keyboard - defined by Java
		// ------------------------------------------------------
		// Scanner - scan the keyboard input and return values to the program
		
	//  ---------------------------------------------------------	
	//  Datatype name          intial-value
	//	int		 sum		 = 0;
		Scanner  theKeyboard = new Scanner(System.in);	// Give me a Scanner object connected to the keyboard
							   // Scanner cannot be resolved as a type*							
							   // 
		
		String   aLine    = "";	// Hold a line of input from the keyboard
		
		System.out.println("Please enter a line and hit enter");
		aLine = theKeyboard.nextLine();	// Get the next line of input from the keyboard and
										// store it in aLine
		
		
		System.out.println("The line entered was: " + aLine); // show line from theKeyboard, 
															  // display line entered from the keyboard
		System.out.println("Please enter a whole number: ");
		int aNumber = theKeyboard.nextInt();
		String aChar = theKeyboard.nextLine(); //	Clear the buffer of the enter key left by nextInt()

		
		System.out.println("You entered: " + aNumber + " half of that is " + aNumber / 2);

		System.out.println("How rude of me, I didn't ask your name. What's your name: ");
		String aName = theKeyboard.nextLine(); 
		
		System.out.println(" Hello, " + aName);		
	// connected to the keyboard
	// Scanner is assigned to System.in
	
	}
}
