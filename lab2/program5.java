package lab2;

class Course{
    static int totalCourses = 0;
    Course(){
        totalCourses++;
    }
    static void getCourses(){
        System.out.println("The total number of courses offered is: "+totalCourses);
    }
}

public class program5 {
    public static void main(String[] args) {
        Course physics = new Course();
        Course mathematics = new Course();
        Course.getCourses();
    }
}
