class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public static void main(String args[]){
    	Student std1 = new Student("Jason", 23);
        System.out.println("The name of the student: "+std1.name);
        System.out.println("The age of the student is: "+std1.age);
    }
}

