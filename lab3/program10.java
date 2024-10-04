package lab3;

import java.util.HashMap;
import java.util.Scanner;

public class program10 {
    static boolean isAnagram(String wordOne, String wordTwo){
        HashMap<Character,Integer> mapOne = new HashMap<>();
        HashMap<Character,Integer> mapTwo = new HashMap<>();
        for(int i=0;i<wordOne.length();i++){
            char ch = wordOne.charAt(i);
            if(mapOne.containsKey(ch)){
                mapOne.put(ch, mapOne.get(ch)+1);
            }
            else{mapOne.put(ch,1);}
        }
        for(int j=0;j<wordTwo.length();j++){
            char ch = wordTwo.charAt(j);
            if(mapTwo.containsKey(ch)){
                mapTwo.put(ch, mapTwo.get(ch)+1);
            }
            else{mapTwo.put(ch,1);}
        }

        boolean flag = false;
        //Checking whether equal and same characters are present in both
        for(char ch: mapOne.keySet()){
            if(mapTwo.containsKey(ch) && mapOne.get(ch)==mapTwo.get(ch)){continue;}
            else{flag=false;}
        }
        int size = wordOne.length();
        
        for(int k=0;k<size;k++){
            if(wordOne.charAt(k)!=wordTwo.charAt(k)){
                flag=true;
                break;
            }
            flag = false;
        }

        return flag;
    }
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first word: ");
        String wordOne = sc.nextLine();
        System.out.print("\nPlease enter the second word: ");
        String wordTwo = sc.nextLine();
        */
        String wordOne="listen",wordTwo="silent";
        System.out.println(isAnagram(wordOne, wordTwo));
    }
}
