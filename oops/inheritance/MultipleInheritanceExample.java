package oops.inheritance;


class Cat {
	public void makeSound() {
		System.out.println("Cat make sounds like Meow..");
	}
	
}
class Dog{
	public void makeSound() {
		System.out.println("Dog can bark like bow... bow...");
	}
}

class Pet extends Dog{
	public void move() {
		System.out.println("Both Pets can walk and run");
	}
}

public class MultipleInheritanceExample {
	
	public static void main(String ...diamondProblem) {
		
		//What is Diamond Problem in java?
		
		Pet p = new Pet();
		p.makeSound();
	}
}







