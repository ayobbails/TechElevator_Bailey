package com.techelevator;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;

@SuppressWarnings("unused")
public class FizzWriter {

	public static void main(String[] args) throws IOException {

		String filePath = "FizzBuzz.txt";
		PrintWriter writer = new PrintWriter(filePath);

		for (int i = 1; i < 301; i++) {
			String iString = Integer.toString(i);
			
			if (i == 300) {
				writer.print("FizzBuzz");
			}
			else if ((i % 3 == 0 && i % 5 == 0)) {
				writer.println("FizzBuzz");
			}
			else if (i % 5 == 0 || iString.contains("5")) {
				writer.println("Buzz");
			}
			else if (i % 3 == 0 || iString.contains("3")) {
				writer.println("Fizz");
			}
			else {
				writer.println(i);
			}
		}
		writer.close();
	}
}