class Rectangle{
    float width, height;
    Rectangle(float width,float height){
        this.width = width;
        this.height= height;
    }
    Rectangle(float width){
        this.width = width;
        this.height = 10.0f; //Sets a default height
    }
    
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.5f, 8.0f);
        Rectangle rect2 = new Rectangle(2.0f);
        System.out.println("The dimension of the first rectanlge are: "+rect1.height+" x "+rect1.width);
        System.out.println("The dimension of the second rectanlge are: "+rect2.height+" x "+rect2.width);
    }
}

