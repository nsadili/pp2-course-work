import java.util.Scanner;

public class Substring {

    static int findSubstringIndex(String str, String substr) {

        if (str.isEmpty() || substr.isEmpty()) {
            return -1;
        }

        int strLen = str.length();
        int substrLen = substr.length();
        boolean isSubstringFound;

        for (int i = 0; i <= strLen - substrLen; i++) {
            isSubstringFound = true; 

            for (int j = 0; j < substrLen; j++) {
                if (str.charAt(i + j) != substr.charAt(j)) {
                    isSubstringFound = false;
                    break;
                }
            }

            if (isSubstringFound) {
                return i; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter a substring to find: ");
        String substr = scanner.nextLine();

        int substrIndex = findSubstringIndex(str, substr);

        if (substrIndex == -1) {
            System.out.println("Substring not found");
        } else {
            System.out.println("Substring found at index " + substrIndex);
        }

        scanner.close();
    }
}

