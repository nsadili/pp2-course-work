import java.util.Scanner;
public class StringReversed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int size = s.length();
        char[] CharOfArray= new char[size];
        char[] charArray = new char[size];

        for (int i = 0; i < size; i++) {
            CharOfArray[i] = s.charAt(i);
        }

        for (int j = 0; j < size; j++) {
            charArray[j] = CharOfArray[size - 1 - j];
        }

        String reverse = new String(charArray);
        System.out.println(reverse);
    }
}