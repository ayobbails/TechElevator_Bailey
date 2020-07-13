package com.techelevator;

/*
 *  
 *  This is a sub-class of the PlayingCard Class
 *  
 *  An ItalianPlayingCard is a PlayingCard = "is-a" implies class Inheritance
 *  
 */



public class ItalianPlayingCard extends PlayingCard {

	// We need at least one ctor that invokes a super ctor - if there aren't any for your class we need a default ctor
	
	public ItalianPlayingCard()
	{
		
		// Since the super class does not have a 0-arg ctor we must use a ctor it has defined
		// The only ctor defined for PlayingCard is 3-args: PlayingCard(int value, String suit, String color)
		super(0, "Joker", "Black"); // Default values for an ItalianPlayingCard
	}
}
