public class Animal{
	void makeSound(){
		System.out.println("The animal makes a sound!");
	}
}

class Dog extends Animal{
	void makeSound(){
		System.out.println("Bow Bow!");
	}
	
	public static void main(String args[]){
		Dog Bolt = new Dog();
		Bolt.makeSound();
	}
}
