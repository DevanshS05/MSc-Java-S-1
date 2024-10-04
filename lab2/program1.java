package lab2;

class websiteVisitor {
    static int userCount = 0;
    websiteVisitor() {
         userCount++;
         System.out.println("The total number of visitors is: " + userCount);
     }
 }
 

public class program1 {
    public static void main(String args[]){   
        websiteVisitor userOne = new websiteVisitor();
        websiteVisitor userTwo = new websiteVisitor();
        websiteVisitor userThree = new websiteVisitor();
        
    }
}
