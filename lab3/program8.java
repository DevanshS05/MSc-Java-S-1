package lab3;

import java.util.Scanner;

public class program8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String myString = sc.nextLine();
        String revString = "";
        for(int i=myString.length()-1;i>=0;i--){revString+=myString.charAt(i);}
        System.out.println("\nThe reversed string is:"+revString);
    }
}