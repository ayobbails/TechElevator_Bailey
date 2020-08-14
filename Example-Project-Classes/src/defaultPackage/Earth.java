package defaultPackage;

public class Earth {
		
	public static void main(String args[]) {
			
//		Human tom; // tom is an instance variable
//		
//		   // calls Human class constructor 
//		   // method to create object
//		
//		tom = new Human(); // creates new Object
//		
//		tom.age = 5;
//		tom.eyeColor = "brown";
//		tom.heightInInches = 72;
//		tom.name = "Tom Zsabo";
//		
//		tom.speak(); // invoke speak method on object tom	
//		
//		Human joe = new Human(); // create a new Human object called joe
//		
//		joe.age = 15;
//		joe.eyeColor = "green";
//		joe.heightInInches = 56;
//		joe.name = "Joe Brick";
//			
//		joe.speak();	
														// Instantiate new Objects
		Human human1 = new Human("Tom", 25,76, "Blue"); // Three new independent Objects
		Human human2 = new Human(null, 0, 0, null);
		Human human3 = new Human(null, 0, 0, null);
		
		human1.speak();
		human2.speak();
		human3.speak();
	
	
	
	}
}
