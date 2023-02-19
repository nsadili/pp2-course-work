import java.util.Scanner;

public class StringReversed {
  public static void main(String[] args) {
    System.out.println("Please enter input: ");

    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    System.out.println(reverse4(input));

  }

  private static String reverse1(String s) {

    String res = "";

    for (int i = s.length() - 1; i >= 0; i--) {

      res += s.charAt(i);

    }

    return res;

  }

  static String reverse2(String s) {

    var chars = s.toCharArray();

    int l = chars.length;

    for (int i = 0; i < l / 2; i++) {
      char temp = chars[i];
      chars[i] = chars[l - 1 - i];
      chars[l - i - 1] = temp;

    }

    return new String(chars);
  }

  private static String reverse3(String s) {

    StringBuilder sb = new StringBuilder();

    for (int i = s.length() - 1; i >= 0; i--) {
      sb.append(s.charAt(i));
    }

    return sb.toString();

  }

  private static String reverse4(String s) {

    // System.out.println("Reversed by 4");

    return new StringBuilder(s).reverse().toString();

  }

}