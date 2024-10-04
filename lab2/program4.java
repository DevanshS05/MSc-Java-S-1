//Design a class order that keeps track of total order placed using a static variable totalOrders.
//Use a static block to initialzie the variable and static methods to increment and display the total orders

package lab2;

class Order{
    static int totalOrders;
    static{
        totalOrders=0;
    }
    static void incrementOrder(){
        totalOrders++;
    }
    static void getTotalOrders(){
        System.out.println("The total no. of orders is: "+totalOrders);
    }
}

public class program4 {
    public static void main(String[] args) {
        Order.incrementOrder();
        Order.incrementOrder();

        Order.getTotalOrders();
    }
}
