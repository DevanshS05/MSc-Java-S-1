class Building{
	String color;
	int floors;
	int price;
	
	Building(String color, int floors, int price){
		this.color = color;
		this.floors = floors;
		this.price = price;
	}
	
	Building(int floors, int price){
		color = "White";
		this.floors = floors;
		this.price = price;
	}
}

class House extends Building{
	String type; //Simplex, Duplex, Triplex, Apartment ...
	
	House(String color, int floors, int price, String type){
		super(color, floors, price);
		this.type = type;
	}
	
	House(int floors, int price, String type){
		super(floors, price);
		this.type = type;
	}
	
	House(int floors, int price){
		super(floors, price);
		this.type = "Simplex";
	}
	
	void displayInfo(){
		System.out.println("The type of the house is: "+type);
		System.out.println("The color of the house is: "+super.color);
		System.out.println("The no of floors is: "+super.floors);
		System.out.println("The price (in $1000) is: "+super.price);
		System.out.println(" - - - - - - - - - - - - - - - - - - - - ");
	}
	
	public static void main(String args[]){
		House h1 = new House("Blue", 5, 1000, "Apartment");
		House h2 = new House(2, 250, "Duplex");
		House h3 = new House(1, 100);
		h1.displayInfo();
		h2.displayInfo();
		h3.displayInfo();
	}
}
