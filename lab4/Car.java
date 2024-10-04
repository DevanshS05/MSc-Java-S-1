class Vehicle{
	void move(){
		System.out.println("The vehicle moves");
	}
}

class Car extends Vehicle{
	void move(){
		super.move();
	}
	
	public static void main(String args[]){
		Car swift = new Car();
		swift.move();
	}
}
