package com.techelevator.dog;

public class Dog {

	boolean isSleeping; 


public Dog() {
	isSleeping = false;
}

public boolean isSleeping() {
	return isSleeping;
}

public String makeSound() {
	if (!isSleeping){
		return "Woof!";
	}
	return "Zzzzz...";
}

public void sleep() {
	isSleeping = true;
}

public void wakeUp() {
	isSleeping = false;
}


}
