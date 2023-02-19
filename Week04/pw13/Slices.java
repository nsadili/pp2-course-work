package Week04.pw13;
import java.util.Scanner;

public class Slices {
    static void sliceWord(String word){
        System.out.println(word);
        for (int i = 1; i < word.length(); i++) {
            System.out.println(word.substring(0, i) + " " + word.substring(i));
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str1 = scan.nextLine();
        scan.close();
        sliceWord(str1);
    }
}
