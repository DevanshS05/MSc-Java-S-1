class Human{
	String name;
	int age = 10; //Default age of 10
	String gender;
	
	Human(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	Human(String name, String gender){
		this.name = name;
		this.gender = gender;
	}
	
	void displayInfo(){
		System.out.println("Name: "+this.name);
		System.out.println("Gender: "+this.gender);
		System.out.println("Age: "+this.age);
	}
	public static void main(String args[]){
		Student s1 = new Student("Agatha", "Female", 23, "PhD");
		Student s2 = new Student("Ricky", "Male", "Middle-School");
		s1.displayInfo();
		s2.displayInfo();
	}
}

class Student extends Human{
	String education;
	
	Student(String name, String gender, int age, String education){
		super(name,gender,age);
		this.education = education;
	}
	
	Student(String name, String gender, String education){
		super(name,gender);
		this.education  = education;
	}
	
	void displayInfo(){
		super.displayInfo();
		System.out.println("Education: "+this.education+"\n");
	}
}
