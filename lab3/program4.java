package lab3;

public class program4 {

    static int[] mergeArray(int arr1[], int arr2[]){
        int sortedArray[] = new int[arr1.length+arr2.length];
        int ptr=0, ptr1=0, ptr2=0;
        while(ptr1<arr1.length && ptr2<arr2.length){
            if(arr1[ptr1]<=arr2[ptr2]){
                sortedArray[ptr++] = arr1[ptr1++];
            }
            else{
                sortedArray[ptr++] = arr2[ptr2++];
            }
        }

        while(ptr1<arr1.length){
            sortedArray[ptr++]=arr1[ptr1++];
        }
        while(ptr2<arr2.length){
            sortedArray[ptr++]=arr2[ptr2++];
        }
        return sortedArray;
    }

    static void printArray(int arr[]){
        for(int number:arr){System.out.print(number+" ");}
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7,9};
        int arr2[] = {2,4,6,8,10};
        int mergedArray[] = mergeArray(arr1, arr2);
        System.out.print("The merged array is: ");
        printArray(mergedArray);
    }
}
