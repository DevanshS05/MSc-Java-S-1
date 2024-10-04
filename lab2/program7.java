package lab2;

class Employee{
    static int empCount = 0;
    int empID = 0;
    Employee(){
        empID = ++empCount;
    }
    void getID(){
        System.out.println("Employee ID is: "+empID);
    }
}
public class program7 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp2.getID();
    }
}
