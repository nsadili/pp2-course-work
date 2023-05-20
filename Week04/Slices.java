package Week04;

import java.util.Scanner;

public class Slices {
   
 
    public static void main(String[] args) {
       System.out.println("enter a input");
        try (Scanner sc = new Scanner(System.in)) {
            String  input = sc.nextLine();
            slice(input);
        }
    }
       static void slice(String s){
        for(var i=0;i<s.length();i++){
            System.out.println(s.substring(0,i)+' ' + s.substring(i));
        }

    }
    
}