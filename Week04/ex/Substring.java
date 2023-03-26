import java.util.Scanner;

public class Substring {

    static int exists(String str, String sub) {
        if (str == null || sub == null) {
            return -1;
        }
        int strLen = str.length(), subLen = sub.length();
        boolean found;
        for (int i = 0; i <= strLen - subLen; i++) {
            found = true;
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();
        String sub = scan.nextLine();

        int index = exists(sentence, sub);
        if (index == -1) {
            System.out.println("Substring not found.");
        } else {
            System.out.println("Substring found at index " + index);
        }

        scan.close();
    }
}
