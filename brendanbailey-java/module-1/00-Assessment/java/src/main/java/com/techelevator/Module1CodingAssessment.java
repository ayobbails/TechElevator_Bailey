package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "HotelInput.csv";
		File hotelReservationFile = new File(fileName);
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner hotelFileScanner = new Scanner(hotelReservationFile);
		@SuppressWarnings({ "resource" })
		PrintWriter writer = new PrintWriter(fileName);
		writer.println("reservation1");
		
		
		HotelReservation reservation1 = new HotelReservation("Carl Thomas", 3);
		reservation1.actualTotal(true, true);
		reservation1.getEstimatedTotal();
	System.out.println(reservation1.getEstimatedTotal());
	}
}
