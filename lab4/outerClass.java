class outerClass{
	String outername = "Outer Class";
	
	class innerClass{
		String innerName = "Inner Class";
		
		void display(){
		System.out.println("The name of the outer class is: "+outerClass.this.outername);
		System.out.println("The name of the inner class is: "+this.innerName);
		}
	}
	
	public static void main(String args[]){
		outerClass outerObject = new outerClass();
		outerClass.innerClass innerObject = outerObject.new innerClass();
		innerObject.display();
	}

}
