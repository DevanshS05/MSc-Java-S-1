package lab3;

import java.util.Scanner;

public class program3 {

    static boolean checkDuplicates(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){return true;}
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("\nPlease enter element no "+ (i+1)+": ");
            arr[i] = sc.nextInt();
        }

        System.out.println(checkDuplicates(arr));
    }
}
