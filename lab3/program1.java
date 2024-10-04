package lab3;

import java.util.Scanner;

public class program1{

    static void printArray(int arr[]){
        for(int number:arr){System.out.print(number+" ");}
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        //Input all the elements of the array using the for loop
        for(int i=0;i<size;i++){
            System.out.print("\n Please enter element no "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nThe array before reversing is: ");
        printArray(arr);

        //Reverse the given array
        for(int j=0;j<size/2;j++){
            int temp = arr[j];
            arr[j] = arr[size-1-j];
            arr[size-1-j] = temp;
        }

        System.out.print("\nThe array after reversal is: ");
        printArray(arr);
    }
}