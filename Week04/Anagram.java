import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("the first word: ");
    String first = sc.nextLine();
    System.out.println("the second word: ");
    String second = sc.nextLine();
    anagrams(first, second); 
}
    public static void anagrams(String word1, String word2) {
    char[] firstWord = sort(word1.toCharArray());
    char[] secondWord = sort (word2.toCharArray ()) ;

    System.out.println(Arrays.toString(firstWord));
    System.out.println(Arrays.toString(secondWord));
     
    if (Arrays.equals(firstWord, secondWord)) 
    System.out.println("anagrams there");
    else System.out.println("not anagrams");
 }  

    public static char[] sort(char[] ch) {
    for (int i = 0; i < ch.length; i++) {
    for (int j =i+1; j< ch.length; j++) {
    if (ch[j] < ch[i]) {
        swap(ch, i, j);
    }
}
    }
return ch;
}

public static void swap(char[] ch, int i, int j) {
    char temp = ch[j];
    ch[j] = ch[i];
    ch[i] = temp;
}

}
