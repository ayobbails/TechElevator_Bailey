package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/* 
		
		Define variables for Java
		
		To define a variable:   data type name;  Un-itialized variable -  content unknown
												 Use of un-itialized variable 
												 May result in unpredictable results
	
		data type name = initial-value; Initialized variable
						 Content is known, safe and recommended 
		
		 Most often used and preferred data types: 
		
		 int -      Number WITHOUT decimal places
		 double -   Number WITH decimal places
		 char -     One character enclosed in ' '
		 String -   Multiple character value to store enclosed in ""
		 boolean -  Stores true or false
		 long -     Number with twice the size of an int very wide range of values			
		 
		 Strings are not a basic java type -  its a special type for words/sentences
		*/
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
		
		int numberOfExercises = 26;
		System.out.println("The variable numberOfExercises contains: " + numberOfExercises); // Display the value in numberOfExercises

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/

		double half = 0.5;
		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/

		String name = "TechElevator";
		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		
		int seasonsOfFirefly = 1;
		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		
		String myFavoriteLanguage = "Java";
		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		
		double pi = 3.1416; // 3.1416 is assumed to be a double value
						    
		// float pi = 3.1416 will return an error
		// float pi = 3.1416F;	// 3.1416F is stated float value
		System.out.println(pi);

		/*
		7. Create and set a variable that holds your name.
		*/

		String Myname = "Brendan";
		System.out.println(Myname);
		
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		
		int mouseButtons = 7;
		System.out.println(mouseButtons);

		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		
		Good practice to initialize a variable even if you arent told to
		
		*/
		

		double pctBatteryLife = 0;
		System.out.println(pctBatteryLife);
		
		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/

		int diff = 121 - 27;
		System.out.println("Difference between 121 and 27 is: " + diff);
		
		
		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/

		double sum = 12.3 + 32.1;
		System.out.println("12.3 + 32.1: " + sum);
		
		
		/*
		12. Create a String that holds your full name.
		*/

		String fullName = "Brendan Joseph Bailey";
		System.out.println();
		
		
		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/

		String newString = "Hello " + fullName;
		System.out.println("newString: " + newString);
		
		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/

		fullName = fullName + " Esquire"; // Overlaying the variable with a new value
		System.out.println("The value is: " + fullName);
		
		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/

		fullName += " Esquire"; // 
		System.out.println("The value is: " + fullName);
		
		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/

		String movieName = "Saw " + 2; // Number can be concatenated to a String 
		System.out.println(movieName);
		
		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/

		System.out.println(movieName + 0);
		
		/*
		18. What is 4.4 divided by 2.2?
		*/

		System.out.println("4.4 divided by 2.2 is: " + 4.4 / 2.2);
		
		/*
		19. What is 5.4 divided by 2?
		*/

		System.out.println("5.4 divided by 2 is: " + 5.4 / 2);
		
		/*
		20. What is 5 divided by 2?
		*/

		System.out.println("5 divided by 2 is: " + 5.0 / 2.0);
		
		/*
		21. What is 5.0 divided by 2?
		*/

		System.out.println("5.0 divided by 2 is: " + 5.0 / 2.0);
		
		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/

		System.out.println("66.6 divided by 100 is: " + 66.6 / 100);
		
		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		
		System.out.println("remainder of 5 divided by 2: " + 5 % 2);
		
		/*
		24. What is 1,000,000,000 * 3?
		*/

		
		System.out.println("1,000,000,000 times 3: " + 1000000000 *  3); // Result is too big to fit as an int
		System.out.println("1,000,000,000 times 3: " + 1000000000 * (long) 3);
		
		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/

		boolean doneWithExercises = true;
		System.out.println(doneWithExercises);
		
		/*
		26. Now set doneWithExercise to true.
		*/
		
		System.out.println(doneWithExercises);
		
	}

}
