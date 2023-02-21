import java.util.Arrays;

public class Anagrams {
    
    public static void main(String[] args) {

        String str1 = new String(args[0]);
        String str2 = new String(args[1]);

        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

      Boolean res = Arrays.equals(a, b);


      if (res == true) {
        System.out.println("Strings are Anagrams");
      }
      else
      {
        System.out.println("Strings are not Anagrams");
      }

    }
}
