package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalGroupNameTests {

	//	Define an object for the class containing the methods you want to test
	
	AnimalGroupName testClass = new AnimalGroupName();
	/* Testing:
	 * 
	 * 1. Provide a name that should be in the set expected in mixed case (Elephant) - expect "Herd"
	 * 
	 * 2. Provide a name that should NOT be in the set expected (Human) - expect "unknown"
	 * 
	 * 3. Provide a name that is in the set but in all lowercase - expect correct group
	 * 
	 * 4. Provide a name that is in the set but in all uppercase - expect correct group
	 * 
	 * 5. Provide a null name - expect "unknown"
	 * 
	 */
	
	@Test
	public void provide_a_mixed_case_name_in_the_set_expected() {
		String animalName = "Elephant";										  			  // Arrange - set up test data
		String groupName = testClass.getHerd(animalName);					  			  // Act - perform the task
		assertEquals("incorrect group name for Elephant", "Herd", groupName); 			  // Assert - check result
	}
	@Test
	public void provide_a_name_NOT_in_the_set_expected() {
		String animalName = "Human";										  			  // Arrange - set up test data
		String groupName = testClass.getHerd(animalName);					  			  // Act - perform the task
		assertEquals("Sending an animalName it is not expecting", "unknown", groupName);  // Assert - check result
																			  
	}
	@Test
	public void provide_a_lowercase_name_in_the_set_expected() {
		String animalName = "rhino";														  // Arrange - set up test data
		String expectedResult = "Crash";										
		String groupName = testClass.getHerd(animalName);					  				  // Act - perform the task
		assertEquals("Sending an animalName it is not expecting", expectedResult, groupName); // Assert - check result
	}				/*Display message if there is a problem		//				//.getHerd
					why it failed*/
	
	@Test
	public void provide_an_uppercase_name_in_the_set_expected() {
		String animalName = "GIRAFFE";										  			  // Arrange - set up test data
		String groupName = testClass.getHerd(animalName);					  			  // Act - perform the task
		assertEquals("Sending an animalName it is not expecting", "Tower", groupName);    // Assert - check result
																			  
	}
}
