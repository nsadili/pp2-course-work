import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String s1 = scan.nextLine();
       String s2 = scan.nextLine();
      if(SubstringIndex(s1, s2) != -1){
          System.out.println("YES");
      }else{
          System.out.println("NO");
      }

    }

    public static int SubstringIndex(String string, String sub) {
        int index = -1;
        if (string != null && sub != null && sub.length() <= string.length()) {
            for (int i = 0; i <= string.length() - sub.length(); i++) {
                if (string.substring(i, i + sub.length()).equals(sub)) {
                    index = i;
                    break;
                }
            }
        }

        return index;
    }
}