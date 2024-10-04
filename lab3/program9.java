package lab3;

import java.util.HashMap;
import java.util.Scanner;

public class program9 {

    static char checkWord(String myString){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<myString.length();i++){
            char ch = myString.charAt(i);
            if(map.containsKey(ch)){map.put(ch,map.get(ch)+1);}
            else{map.put(ch,1);}
        }

        for(int j=0;j<myString.length();j++){
            char ch = myString.charAt(j);
            if(map.get(ch)==1){return ch;}
        }

        return 0; //0 is the ASCII code for null
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String myString = sc.nextLine();
        
        System.out.println(checkWord(myString));
    }
}
