import java.util.Scanner;

public class Substring {

    static int exists(String str, String sub) {

        if (str.isEmpty() || sub.isEmpty())
            return -1;

        int strLen = str.length(), subLen = sub.length();
        boolean found;

        for (int i = 0; i < strLen - subLen; i++) {
            found = true; // assuming the sub exists in str starting from index i.
            for (int j = 0; j < subLen; j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found)
                return i; // return the index where sub is found
        }

        return -1; // if it has not returned yet, means it is not there
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();
        String sub = scan.nextLine();

        System.out.println(exists(sentence, sub));

        scan.close();
    }
}
