import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string number: ");
        String str = scn.nextLine();
        String newstr = "";
        int num = 0;
        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                // with exception
                // IllegalArgumentException e = new IllegalArgumentException("The string contains non-digit characters");
                // throw e;

                // ignoring non-digit characters
                newstr += str.charAt(i);
            }
        }
        num =  Integer.parseInt(newstr);
        System.out.println(num);

    }
}
