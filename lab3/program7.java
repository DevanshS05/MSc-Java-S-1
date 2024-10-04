package lab3;

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String myString = sc.nextLine();
        int vCount=0,cCount=0;

        for(int i=0;i<myString.length();i++){
            char ch = myString.charAt(i);
            if((int)ch>=97 && (int)ch<=122){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){vCount++;}
                else{cCount++;}
            }
        }

        System.out.print("\nThe no. vowels is: "+vCount);
        System.out.print("\nThe no. of consonants is: "+cCount);
    }
}
