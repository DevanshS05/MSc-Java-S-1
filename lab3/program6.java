package lab3;

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string (all small or all capital):");
        String myString = sc.nextLine();
        boolean flag = true;
        for(int i=0;i<myString.length()/2;i++){
            if(myString.charAt(i)!=myString.charAt(myString.length()-1-i)){
                flag=false;
                break;
            }
        }
        System.out.println();
        if(flag){
            System.out.println("Given string is palindrome!");
        }
        else{
            System.out.println("Given string is not palindrome!");
        }
    }
}
