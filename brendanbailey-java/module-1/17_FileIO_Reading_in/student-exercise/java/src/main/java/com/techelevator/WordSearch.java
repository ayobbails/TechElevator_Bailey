package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*	  -	Ask user for a search string and a file-system path for a text file.
 * 	  -	The program searches the file for occurrences of the 
 * 			search string and each time it finds a line that matches
 * 			it displays the line number and contents of the line it was found in on the console.
 * 
 * 	  -	Line numbers begin with 1.
 */

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		int matchCounter = 0;
		boolean caseSensitive = false;
		File inputFile = new File("./alices_adventures_in_wonderland.txt");
		Scanner keyboard = new Scanner(System.in);

		Scanner fileReader = new Scanner(inputFile);

		System.out.println("What is the search word you are looking for?");
		String searchTerm = keyboard.nextLine();

		System.out.println("Case sensitive? (Y/N)");
		if (keyboard.nextLine().equals("Y")) {
			caseSensitive = true;
		} else {
			caseSensitive = false;
		}
		
		while (fileReader.hasNext()) {
			String thisLine = fileReader.nextLine();
			String[] lineWords = thisLine.trim().split("\\s+"); // trim() 

			if (caseSensitive) {
				for (String word : lineWords) {
					if (word.contains(searchTerm)) {
						System.out.println(++matchCounter + ") " + thisLine);
					}
				}
			}
			else if (!caseSensitive) {
				for(String word : lineWords) {
					if (word.toLowerCase().contains(searchTerm.toLowerCase())) {
						System.out.println(++matchCounter + ") " + thisLine);
					}
				}
			}
		}
	}
}