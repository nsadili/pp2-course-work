import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Please, enter the string: ");
    String string = sc.nextLine();

    System.out.println("Please, enter the substring: ");
    String substring = sc.nextLine();

    sc.close();

    System.out.println(isSubString(string, substring));
    }
    public static int isSubString(String string, String subString) {
        for( int i = 0; i <= string.length() -subString.length(); i++) {
            boolean same = true; 
            for(int j = 0; j < subString.length(); j++) {
                if(string.charAt(i+j) != subString.charAt(j)) {
                    same = false;
                    break;
                }
            }
            if(same) {
                return i;
            }
        }
        return -1;
    }
}