package com.techelevator;

public class Examples {

	public static void main(String[] args) {

		// declaration statement for a variable named "result" of type boolean
		boolean result;

		System.out.println("****************************");
		System.out.println("*** COMPARISON OPERATORS ***");
		System.out.println("****************************");
		System.out.println();
		
		/*
		 ==  Equal to
		 !=  Not equal to
		*/
		
		result = (2 == 2);
		System.out.println("2 == 2 : " + result);
		
		result = (2 == 3);
		System.out.println("2 == 3 : " + result);
		
		result = ('a' == 'a');
		System.out.println("'a' == 'a' : " + result);
		
		result = ('a' == 'b');
		System.out.println("'a' == 'b' : " + result);
		
		result = (2 != 2);
		System.out.println("2 != 2 : " + result);
		
		result = (2 != 3);
		System.out.println("2 != 3 : " + result);
		
		result = ('a' != 'a');
		System.out.println("'a' != 'a' : " + result);
		
		result = ('a' != 'b');
		System.out.println("'a' != 'b' : " + result);
		System.out.println();

		/*
		 >  Greater than
		 <  Less than
		 >= Greater than or equal to
		 <= Less than or equal to
		*/
		result = (2 > 1);
		
		System.out.println("2 > 1 : " + result);
		result = (2 < 2);
		
		System.out.println("2 < 2 : " + result);
		result = (2 < 2);
		
		System.out.println("2 < 2 : " + result);
		result = (2 <= 3);
		
		System.out.println("2 <= 3 : " + result);
		result = (5 >= 5);
		System.out.println("5 >= 5 : " + result);
		System.out.println();

		System.out.println("*************************");
		System.out.println("*** LOGICAL OPERATORS ***");
		System.out.println("*************************");
		System.out.println();
		/*
		 &&  AND
		 ||  OR
		 !  NOT
		 ^  XOR  (exclusive OR)
		 */
		
		result = true && true;
		System.out.println("true && true : " + result);
		
		result = true && false;
		System.out.println("true && false : " + result);
		
		result = false && false;
		System.out.println("false && false : " + result);

		result = true || true;
		System.out.println("true || true : " + result);
		
		result = true || false;
		System.out.println("true || false : " + result);
		
		result = false || false;
		System.out.println("false || false : " + result);

		result = !true;
		System.out.println("!true : " + result);
		
		result = !false;
		System.out.println("!false : " + result);

		result = true ^ true;
		System.out.println("true ^ true : " + result);
		
		result = true ^ false;
		System.out.println("true ^ false : " + result);
		
		result = false ^ false;
		System.out.println("false ^ false : " + result);
		System.out.println();

		System.out.println("***************************");
		System.out.println("*** BOOLEAN EXPRESSIONS ***");
		System.out.println("***************************");
		System.out.println();

		int value = 100;
		result = (value > 200) || (value < 500);
		System.out.println("(value > 200) || (value < 500) : " + result);

		result = (value > 200) && (value < 500);
		System.out.println("(value > 200) && (value < 500) : " + result);

		result = !(value >= 300);
		System.out.println("!(value >= 300) : " + result);

		System.out.println("*******************************");
		System.out.println("*** SHORT CIRCUIT OPERATORS ***");
		System.out.println("*******************************");
		System.out.println();

		int x = 3;
		int y = 0;
		
		// result = (y > 0) && (x / y) > 2;  // causes a divide by zero exception to be thrown
		
		result = (y > 0) && (x / y) > 2;
		System.out.println(result);

		System.out.println("*******************************");
		System.out.println("*** IF STATEMENTS ***");
		System.out.println("*******************************");
		System.out.println();

		//----------------------------------------------------

		System.out.println("*** Basic if statement ***");

		int freezingPointFahrenheit = 32;
		int outsideTempFahrenheit = 80;
		if (outsideTempFahrenheit <= freezingPointFahrenheit) {
			System.out.println("Would you like a nice hot cup of coffee?");
		} else {
			System.out.println("Would you like a cool, refreshing iced mocha?");
		}

		//----------------------------------------------------

		System.out.println("*** if-else statement ***");

		boolean condition1 = true;
		boolean condition2 = true;
		if (condition1) {
			System.out.println("Condition 1 is true!");
		} else if (condition2) {
			System.out.println("Condition 2 is true!");
		} else {
			System.out.println("No conditions are true!");
		}

		//----------------------------------------------------

		System.out.println("*** a boolean variable is valid boolean expression ***");

		boolean isSunny = true;
		if (isSunny) {
			System.out.println("Better wear some sun screen...");
		}

		//----------------------------------------------------

		System.out.println("*** if statements can be used with blocks ***");

		if (outsideTempFahrenheit > freezingPointFahrenheit) {
			System.out.println("Summer time!!!");
		} else {
			System.out.println("Dress in layers");
			System.out.println("Wear gloves");
			System.out.println("Wear hat");
			System.out.println("Wear scarf");
		}

		System.out.println("*******************************");
		System.out.println("*** VARIABLE SCOPE ***");
		System.out.println("*******************************");
		System.out.println();

		int firstVariable = 2;
		if (firstVariable > 0) {
			int secondVariable = firstVariable;
		}
		//int thirdVariable = secondVariable * 2; // this will cause a compile error because secondVariable is not "in scope"
		//int firstVariable = 3;  // this is a compiler error because we already have a variable named firstVariable in this scope
		int secondVariable = 7; // this is allowed because there is no variable named secondVariable in this scope

		boolean burnItDown = shouldBurnDownTheBuilding(14, 20);
	}

	static boolean shouldBurnDownTheBuilding(int numberOfEmployees, int piecesOfCake) {
		if (numberOfEmployees > piecesOfCake) {
			return true;
		} else {
			return false;
		}
	}
}

/*
 * 19. You are driving a little too fast, and a police officer stops you. Write
 * code to compute the result, encoded as an int value: 0=no ticket, 1=small
 * ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is
 * between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the
 * result is 2. Unless it is your birthday -- on that day, your speed can be 5
 * higher in all cases. 
 * caughtSpeeding(60, false) → 0 
 * caughtSpeeding(65, false) → 1 
 * caughtSpeeding(65, true) → 0
 */
public int caughtSpeeding(int speed, boolean isBirthday) {
 // Rewording the problem statement:
 // There are four rules:
 // Rule 1: If speed is less than or equal to 60, return 0
 // Rule 2: If speed is greater than or equal to 61 AND speed is less than or
 // equal to 80, return 1
 // Rule 3: if speed is greater than or equal to 81, then return 2
 // Rule 4: If it is your birthday, 5 will be forgiven from your speed (i.e.
 // speed minus 5)
 //
 // Let's see if we can forgive 5 from speed because it is your birthday
 // Start with setting adjustedSpped to speed, and then minus 5 from
 // adjustedSpeed if its your birthday
 int adjustedSpeed = speed;
 if (isBirthday == true) {
     // Its your birthday, so 5 is forgiven from your speed
     adjustedSpeed = adjustedSpeed - 5;
 }
 // adjustedSpeed is now either your original speed, or reduced by 5 because its
 // your birthday
 // All further decisions are based upon the adjustedSpeed
 //
 // Check Rule 2
 if (adjustedSpeed >= 61 && adjustedSpeed <= 80) {
     return 1;
 }
 // Check Rule 3
 if (adjustedSpeed >= 81) {
     return 2;
 }
 // Given the two previous checks, the speed has to be 60 or less, so apply Rule
 // 1 without needing to check
 return 0;
}

/*
 * 33. Given three ints, a b c, return true if they are in strict increasing
 * order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the
 * exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5
 * 5 5. 
 * inOrderEqual(2, 5, 11, false) → true 
 * inOrderEqual(5, 7, 6, false) → false 
 * inOrderEqual(5, 5, 7, true) → true
 */
public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
 // Rewording the problem statement
 // There are two rules:
 //      Rule 1: If a is less than b, AND b is less than c, return true, otherwise return false
 //      Rule 2: If a is less than or equal b, and b is less than or equal to c, return true, otherwise return false
 // If equalOK == true, then apply Rule 2, otherwise apply Rule 1
 //
 // Let's see what rule to apply
 if (equalOk) {
     // Apply Rule 2 because equalOK is true
     // Check that a is less than or equal to b, AND b is less than or equal to C
     if (a <= b && b <= c) {
         // a, b, c are in correct order, and may be equal
         return true;
     }
     else {
         // a, b, c were not in correct order
         return false;
     }
 } 
 else {
     // Apply Rule 1
     // Check that a is less than b, AND b is less than C
     if (a < b && b < c) {
         // a, b, c are in correct, and are not equal at any point
         return true;
     }
     else {
         // a, b, c are not in correct order
         return false;
     }
 }
}