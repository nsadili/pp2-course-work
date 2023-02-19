package Week04;

import java.util.Scanner;

public class Sortedstr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        char[] ch = string.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[j] < ch[i]) {
                    char temp = ch[j];
                    ch[j] = ch[i];
                    ch[i] = temp;
                }
            }
        }
        for (char x : ch){
            System.out.print(x + " ");
        }
    }
}
