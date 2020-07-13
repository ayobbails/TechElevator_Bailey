package com.techelevator.myFileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader {

	public static void main(String[] args) throws FileNotFoundException {

		File myFile = new File("./data/numbers.txt"); // ------Define a file object for numbers.txt
		Scanner inputFile = new Scanner(myFile); // -----------Define a Scanner object to access the file

		int grandTotal = 0;//----------------------------------Hold total of all lines
		
		while (inputFile.hasNext()) {// -----------------------Loop while there is date in the file
			String aLine = inputFile.nextLine(); // -----------Read the next line from the file into aLine
			System.out.println("Line the file: " + aLine);
			// sum the numbers in the line
			String[] theNumbers = aLine.split(",");// ---------Extract each number from the line into an array

			int sum = 0; // -----------------------------------Variable to hold the sum
			for (String aNum : theNumbers) { // ---------------Loop through the array of numbers with aNum holding the
								      /*current number*/
				sum = sum + Integer.parseInt(aNum);// ---------Convert the current number (which is a String) to an int and add it to sum
			}
			grandTotal += sum;
			
		System.out.println("the sum of the numbers is: " + sum);
		}
		System.out.println("the grand total of all numbers in all lines is: " + grandTotal);
		inputFile.close(); // ---------------------------------Close the file after the loop since I'm done with it
							
	}
}
