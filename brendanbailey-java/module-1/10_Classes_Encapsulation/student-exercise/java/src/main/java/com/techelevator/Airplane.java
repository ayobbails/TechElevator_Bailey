package com.techelevator;

public class Airplane {
private String planeNumber;
private int bookedFirstClassSeats;
private int bookedCoachSeats;
private int availableCoachSeats;
private int totalCoachSeats;
private int availableFirstClassSeats;

			//   Values for the instance fields
		    //	 
			//	 Parameters specify the type and name of data available for reference
			//	 	within a method's scope.
			//	 within the constructor, we assign the parameter value to the 
			//   	instance field.

public Airplane (String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
	this.planeNumber = planeNumber;
	this.availableFirstClassSeats = totalFirstClassSeats;
	this.availableCoachSeats = totalCoachSeats;
}


public String getPlaneNumber() {
	return planeNumber;
}


public int getBookedFirstClassSeats() {
	return bookedFirstClassSeats;
}


public int getAvailableFirstClassSeats() {
	return getBookedFirstClassSeats() - bookedFirstClassSeats;
}


public int getBookedCoachSeats() {
	return bookedCoachSeats;
}


public int getAvailableCoachSeats() {
	availableCoachSeats = availableCoachSeats - bookedCoachSeats;
	return availableCoachSeats;
}


public int getTotalCoachSeats() {
	return availableCoachSeats;
}


boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
	if (forFirstClass == true && totalNumberOfSeats <= availableFirstClassSeats) {
		availableFirstClassSeats = totalNumberOfSeats;
	}
	return false;
}




}
