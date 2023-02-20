import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
   public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter the first number:");
    String first= scan.nextLine();
    System.out.println("Enter the second number:");
    String second= scan.nextLine();
    anagrams(first, second);
   // System.out.println("");
   } 
 public static void anagrams(String word1, String word2 ) {
    String[] firstWord=sort(word1.split(""));
    String[] secondWord=sort(word2.split(""));
    System.out.println(Arrays.toString(firstWord));
    System.out.println(Arrays.toString(secondWord));
    if(Arrays.equals(firstWord, secondWord)) System.out.println("anagrams");

    else System.out.println("not anagrams");
 }
public static String[] sort(String[] n) {
    for(int i=0; i<n.length; i++){
        for(int j=i+1; i<n.length; j++){
            if(n[j].compareTo(n[i] < 0)) {
                swap(n,i,j);
            }
        }
    }
    return n;
}
public static void swap(String[] n, int i, int j) {
    String temp = n[j];
    n[j]=n[i];
    n[i]=temp;
}
}
