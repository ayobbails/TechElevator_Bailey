package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
	//	Classes are always UpperCase
	//	An ArrayList is a type of List - Used to hold a collection of objects.	
	//	to define;	
	//
	//		List<data-type> name = new ArrayList<data-type>();
		
		List<String> names = new ArrayList<String>(); // instantiate an ArrayList of Strings
		
		names.add("Nate");	// .add is how we add an element to an ArrayList
		names.add("Paul");
		names.add("Plip");
		names.add("Doug");
		
		System.out.println("####################");
		System.out.println("Lists are ordered - the way/order they are added");
		System.out.println("####################");
		
		for(int i = 0; i <names.size(); i++) {
			//-------------------.size() will return the number of elements in the ArrayList (it was .length for an array)
			//--------------------System.out.println("Element #" + i + ": " + names[i]);
			   
			System.out.println("Element #" + i + ": " + names.get(i));
		
		}
		
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Carl"); // Its ok to add an entry that already exists
		for(int i = 0; i <names.size(); i++) {
			//-------------------.size() will return the number of elements in the ArrayList (it was .length for an array)	   
			System.out.println("Element #" + i + ": " + names.get(i));
			//--------------------System.out.println("Element #" + i + ": " + names[i]);
		}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(4, "Brendan"); // add a new element after the index given - add at index 4
		
		for(int i = 0; i <names.size(); i++) {
			//--------------------System.out.println("Element #" + i + ": " + names[i]);
			System.out.println("Element #" + i + ": " + names.get(i));
			//-------------------.size() will return the number of elements in the ArrayList (it was .length for an array)
		}
		
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		names.remove(4);	// .remove will remove the element at the index specified
		
		for(int i = 0; i <names.size(); i++) {
			//------------------System.out.println("Element #" + i + ": " + names[i]);
			System.out.println("Element #" + i + ": " + names.get(i));
			//------------------.size() will return the number of elements in the ArrayList (it was .length for an array)
		}
		
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		if (names.contains("Tracy")) {
				System.out.println("Found entry in ArrayList");
				} 
					else {
						System.out.println("Found entry NOT in ArrayList");
						  }
		
		for(int i = 0; i <names.size(); i++) {
			//--------------------System.out.println("Element #" + i + ": " + names[i]);
			System.out.println("Element #" + i + ": " + names.get(i));
			//-------------------.size() will return the number of elements in the ArrayList (it was .length for an array)
		}
		
		
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] namesArray = names.toArray(new String[names.size()]);
			
			// 1. Ask toArray() to create a new String array with the same number of elements as the ArrayList
			
		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		
		
		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */

		// A primitive wrapper allows you to store primitives in an ArrayList
		// Integer - a Class to create Object from an int
		// Double - a Class to create Object from an double
		// Float - a Class to create Object from an float
		// Boolean - a Class to create Object from an boolean
		// Character - a Class to create Object from an char
		//
		// Integer.parseInt() - use the wrapper Class to convert a String to an int
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);	// Add an element to an ArrayList
		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		// foreach is a short hand loop for processing all the elements in a Collection Class
		//
		// foreach is sometimes known as the "enhanced" for loop
		//
		// foreach loop: Always goes from the beginning to the end of the Collection -ArrayList
		//---------------Cant stop in the middle, cant start anywhere but the first element, in a regular for loop you can
		//---------------Always process each element in order - can't skip elements
		
		// Syntax: for (a-variable-to-hold-the-current-element : ArrayList-name) {
		//--------------In the body of the loop use the variable you defined to access the current element
		//	{
		//
		//	
		System.out.println("Elements displayed using a regular for-loop");
		System.out.println(); // Display a blank line
		for(int i = 0; i <names.size(); i++) {
			System.out.println("Element #" + i + ": " + names.get(i));
		}
		
		System.out.println("Elements displayed using a regular foreach-loop");
		System.out.println(); //--------------------------------------Display a blank line
		for(String anElement: names) { //-----------------------------Each time through the loop anElement will contain the current element in the ArrayList
		//------------------------------------------------------------Each element in the ArrayList is a String
			System.out.println("Element : " + anElement);
		//------------------------------------------------------------So our foreach variable needs to be a String
		}	
			
			
			
		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();

		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////

		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();

		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////

		////////////////////
		// POPPING THE STACK
		////////////////////

	}
}
