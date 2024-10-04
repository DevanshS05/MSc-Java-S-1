package lab3;

import java.util.Scanner;

public class program5 {

    static void printArray(int arr[]){
        for(int number:arr){System.out.print(number+" ");}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        //Input all the elements of the array using the for loop
        for(int i=0;i<size;i++){
            System.out.print("\n Please enter element no "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nInput the no of steps by which the array is to be shifted right: ");
        int shift = sc.nextInt();
        shift = shift%size;
        int shiftedArr[] = new int[size];
        for(int i=0;i<size;i++){
            shiftedArr[(i+shift)%size] = arr[i];
        }

        System.out.print("\nThe shifted array is: ");
        printArray(shiftedArr);
    }
}

/* 1 2 3 4 5 
   4 5 1 2 3
 */
