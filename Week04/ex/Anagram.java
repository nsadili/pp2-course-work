import java.util.*;
public class Anagram {
    public static void sort(char a[]){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
               if (a[i] > a[j]) {
                  char b = a[i];
                  a[i] = a[j];
                  a[j] = b;
               }
            }
         }
    }
   static boolean isAnagram(char a[], char b[]) {
        return Arrays.equals(a,b);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word1 = sc.next();
    String word2=sc.next();
    word1=word1.toLowerCase();
    word2=word2.toLowerCase();
      sc.close();
    char[] a= word1.toCharArray();
    char[] b= word2.toCharArray();
    sort(a);
    sort(b);
    System.out.println(isAnagram(a,b));
    
}
}
