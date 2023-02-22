
package Week04.practicalwork;

import java.util.Scanner;

public class Anagrams {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(checkAnagram(a, b));
      }
  
      public static boolean checkAnagram (String a, String b){
        char [] alow = a.toLowerCase().toCharArray();
        char [] blow = b.toLowerCase().toCharArray();
        boolean flag = false;
  
        if(a.length() == b.length()){
          for(int i = 0; i<a.length()/2; i++){
            if(alow[i] != blow[b.length()-1-i]){
              flag = true;
            }
          }
        }
        else{
            flag = true;
        }
  
        if(flag == true){
          return false;
        }
        else{
          return true;
        }
      }
}
