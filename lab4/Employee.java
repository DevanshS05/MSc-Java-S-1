class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Employee extends Person{
	int salary;
	Employee(String name, int age, int salary){
		super(name,age);
		this.salary =  salary;
	}
	void printInfo(){
	System.out.println("Name: "+super.name);
	System.out.println("Age: "+super.age);
	System.out.println("Salary: "+salary);
	}
	
	public static void main(String args[]){
		Employee emp1 = new Employee("John Doe", 25, 30000);
		emp1.printInfo();
	}
}
