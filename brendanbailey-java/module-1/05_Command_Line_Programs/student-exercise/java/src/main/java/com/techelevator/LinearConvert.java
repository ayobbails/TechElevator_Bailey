package com.techelevator;

import java.util.Scanner;

	public class LinearConvert {
	

// Write a program that converts meters to feet and vice-versa

// The foot meter conversion formula is:
	// m = f * 0.3048

// The meter to foot conversion formula is:
	// f = m * 3.2808399
	
// Write a command line program which prompts a user to enter a length, 
// and whether the measurement is in (m)eters or (f)eet
	
// Convert the length to the opposite measurement, 
// and display the old and new measurements to the console.	
	
// Please enter the length: 58
// Is the measurement in (m)eter, or (f)eet?
// 58f is 17m
	
	public static void main(String[] args) {
			
		Scanner theKeyboard = new Scanner(System.in);
			
		System.out.println("Please enter a length and hit enter"); //	parse.int
		String aChar = theKeyboard.nextLine();
		int dist = Integer.parseInt(aChar);
		
		System.out.println("Please enter the unit of measurement (m)meters or (f)feet");
		String unitOfM = theKeyboard.nextLine();
		
		if (unitOfM.equals("m")) {
			double meterToFeet = dist * 3.2808399;
		System.out.println("In feet " + (int)meterToFeet);
		} if (unitOfM.equals("f")) {
			double feetToMeters = dist * 0.3048;
		System.out.println("In meters " + (int)feetToMeters);
		}
		
			
			// System.out.println("The line entered was: ");
	
			// System.out.println("Please enter the measurement type (m)eters or (f)eet");
	
			
		}

}
