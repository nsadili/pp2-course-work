import java.util.Scanner;

public class MixStr {
    public static String Swap(String sntnc) {
        String[] words = sntnc.split(" ");
        StringBuilder res = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 1) {
                res.append(word).append(" ");
                continue;
            }
            char ch1 = word.charAt(0);
            char ch2 = word.charAt(word.length() - 1);
            String mid = word.substring(1, word.length() - 1);
            res.append(ch2).append(mid).append(ch1).append(" ");
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the sentence: ");
        String sntnc = scanner.nextLine();
        scanner.close();

        String swpSnt = Swap(sntnc);
        System.out.println("In: " + sntnc);
        System.out.println("Out: " + swpSnt);
    }
}