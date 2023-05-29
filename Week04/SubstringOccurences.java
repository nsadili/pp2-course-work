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
                int k = 0; 
                while(i + k <first.length() && j + k < second.length()) {
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