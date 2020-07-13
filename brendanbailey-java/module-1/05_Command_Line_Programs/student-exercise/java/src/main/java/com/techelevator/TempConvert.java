package com.techelevator;

import java.util.Scanner;

public class TempConvert {

// Convert a temperature from one unit of measure to another
// The Fahrenheit to Celcius conversion formula is	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// System.out.println(4 % 7);
		Scanner theKeyboard = new Scanner(System.in);
		System.out.println("Please enter a temperature and hit enter");
		String aChar = theKeyboard.nextLine();
		double tempr = Integer.parseInt(aChar);	
		
		System.out.println("Please enter the temperatures unit of measure as (f)ahrenheit or (c)elcius and hit enter");
		String tempUnit = theKeyboard.nextLine();
		
		if (tempUnit.equals("c")) {
			double fToCel = (tempr - 32) * 5 / 9;
			System.out.println("In Fahrenheit " + (int)fToCel);
			} 
		if (tempUnit.equals("f")) {
			double celToF = (tempr * 9 / 5) + 32;
			System.out.println("In Celcius " + (int)celToF);
			}
		}
	}
