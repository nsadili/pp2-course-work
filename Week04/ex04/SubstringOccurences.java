import java.util.Scanner;

public class SubstringOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your first string: ");
        String first = sc.nextLine();

        System.out.println("Please, enter your second string: ");
        String second = sc.nextLine();

        sc.close();
        int count = countStr(first, second);
        System.out.println("Number of common substrings: " + count);

    }
    private static int countStr(String first, String second) {
        int count = 0;
        for(int i = 0; i < first.length(); i++) {
            for(int j = 0; j < second.length(); j++) {
                // k is the length of the common substrings
                int k = 0; 
                // while check if i+k and j+k withing the strings
                while(i + k <first.length() && j + k < second.length()) {
                    //charAt compares characters in strings
                    if(first.charAt(i + k) != second.charAt(j+k)) {
                        break;
                    }
                    if(k > 0) {
                        count++;
                        System.out.println(first.substring(i, i + k + 1));
                    }
                    k++;
                }
            }
        }
        return count;
    }
}
