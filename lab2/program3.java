package lab2;

class Student{
    static int idCount = 0;
    int id;
    Student(){
        this.id = ++idCount;
    }
    static void nextAvailableId(){
        int temp = idCount+1;
        System.out.println("The next available ID is: "+temp);
    }
}

public class program3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println("ID of student2 is: "+student2.id);
        Student.nextAvailableId();
    }
}
