package com.techelevator;

public class HotelReservation {

	/*
	 * Data members 
	 */
	
	private String name;
	private int numberOfNights;
	private double estimatedTotal;

	/*
	 * Constructors
	 */
	
	public HotelReservation() { //Default ctor
	}
	
	public HotelReservation(String name, int numberOfNights) { // 2-arg ctor
		this.name = name;
		this.numberOfNights = numberOfNights;
	}

	/*
	 * Getters and Setters
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfNights() {
		return numberOfNights;
	}

	public void setNumberOfNights(int numberOfNights) {
		this.numberOfNights = numberOfNights;
	}

	public double getEstimatedTotal() {
		return estimatedTotal;
	}

	public void setEstimatedTotal(double estimatedTotal) {
		this.estimatedTotal = estimatedTotal;
	}

	public String toString() {
		String aString = "RESERVATION=" + name + " - estimated total=" + estimatedTotal;
		return aString;
	}
	
	public double actualTotal (boolean usedMinibar, boolean requiresCleaning) {
		if (usedMinibar == true && requiresCleaning == true) {
			return estimatedTotal + 82.97;
		} if (requiresCleaning == true && usedMinibar == false) {
			return estimatedTotal + 34.99;
		} if (requiresCleaning == false && usedMinibar == true)  {
			return estimatedTotal + 12.99;
		} else {
			return estimatedTotal;
		}
	}
}
	
	
	

