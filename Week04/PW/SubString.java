import java.util.Scanner;
public class SubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        System.out.print("Enter a substring: ");
        String sub = input.nextLine();
        
        int index = findSubstring(str, sub);
        
        if (index == -1) {
            System.out.println(sub + " is not a substring of " + str);
        } else {
            System.out.println(sub + " is a substring of " + str + " at index " + index);
        }
    }
    
    public static int findSubstring(String str, String sub) {
        if (sub.length() > str.length()) {
            return -1;
        }
        
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            boolean found = true;
            
            for (int j = 0; j < sub.length(); j++) {
                if (str.charAt(i+j) != sub.charAt(j)) {
                    found = false;
                    break;
                }
            }
            
            if (found) {
                return i;
            }
        }
        
        return -1;
    }

}
