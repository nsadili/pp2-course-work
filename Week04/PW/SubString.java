import java.util.Scanner;

public class SubString {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter the first input: ");
    String s1 = sc.nextLine();
    System.out.println("Please enter the second input:");
    String s2 = sc.nextLine();

    System.out.println(subString(s1, s2));

  }

  private static int subString(String s1, String s2) {
    int flag = 0;

    for (var i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == s2.charAt(0)) {
        for (var j = 1; j < s2.length(); j++) {
          if (s1.charAt(i + j) != s2.charAt(j))
            flag++;
          ;
        }

        if (flag == 0) {
          return i;
        } else {
          flag = 0;
        }

      }
    }

    return -1;
  }
}