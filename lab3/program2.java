package lab3;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("\nPlease enter element no "+ (i+1)+": ");
            arr[i] = sc.nextInt();
        }
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for(int j=0;j<size;j++){
            if(arr[j]<minimum){minimum=arr[j];}
            if(arr[j]>maximum){maximum=arr[j];}
        }

        System.out.println("\nThe maximum number is: "+maximum);
        System.out.println("The minimum number is: "+minimum);
    }
}
