class Parent{
	String pName;
	
	Parent(String pName){
		this.pName = pName;
	}
	
	void display(){
		System.out.println("The name of the parent is: "+pName);
	}
}

class Child extends Parent{
	String cName;
	Child(String cName, String pName){
		super(pName);
		this.cName = cName;
	}
	
	void display(){
		System.out.println("The name of the child is: "+cName);
	}
	
	void getInfo(){
		super.display();
		this.display();
	}
	
	public static void main(String args[]){
		Child c = new Child("Jason","Emily"); //Child-Name -- Parent-Name
		c.getInfo();
	}
}
