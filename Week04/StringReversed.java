package Week04;

public class StringReversed {
        public static void main(String[] args) {
          String str = "Hello, world!";
          String reversed = reverseString(str);
      
          System.out.println("Original string: " + str);
          System.out.println("Reversed string: " + reversed);
        }
      
        public static String reverseString(String str) {
          StringBuilder sb = new StringBuilder();
      
          for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
          }
      
          return sb.toString();
        }
      }
      