package Week04.ex12;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();
        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();

        int index = findSubstringIndex(str, sub);

        if (index == -1) {
            System.out.println("The substring is not found in the main string.");
        } else {
            System.out.println("The substring is found in the main string at index " + index + ".");
        }

        sc.close();
    }
    

    public static int findSubstringIndex (String str, String sub) {
        int strLen = str.length();
        int subLen = sub.length();
    
        for (int i = 0; i <= strLen - subLen; i++) {
            boolean found = true;
            for (int j = 0; j < subLen; j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
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
