package lab2;

class Product{
    static float VAT = 18.0f;
    static float discount = 20.0f;
    static void calculatePrice(float price){
        float finalPrice = price*(1-(discount/100))*(1+VAT/100);
        System.out.println("The final calculated price is: "+finalPrice);
    }
}

public class program6 {
    public static void main(String[] args) {
        Product.calculatePrice(500);
    }
}
