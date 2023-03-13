import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();
        input.close();

        List<String> commonSubstrings = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String substring = s1.substring(i, j);
                if (s2.indexOf(substring) == i) {
                    commonSubstrings.add(substring);
                    count++;
                }
            }
        }

        for (String substring : commonSubstrings) {
            System.out.println(substring);
        }

        System.out.println("Number of common substrings: " + count);
    }
}