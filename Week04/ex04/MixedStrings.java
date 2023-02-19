import java.util.Scanner;

public class MixedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your sentence: ");
        String sentence = sc.nextLine();
        sc.close();

        System.out.println(MixString(sentence));
    }
    
    public static String MixString(String sentence) {

        // a char array carries the same given array
        char[] ch = sentence.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            int j = i; // j stores index of the first character
            while(i < ch.length && ch[i] != ' ')
            i++; // i stores index of the las character

            //swapping part
            char temp = ch[j];
            ch[j] = ch[i-1];
            ch[i-1] = temp;
        }
        return new String(ch);
    }
}
