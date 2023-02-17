import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(sort(str));

    }
    static String sort(String str) {
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        int l = ch.length;
        for(int i=0; i<l-1; i++) {
            if(ch[i]>ch[i+1]) {
                char tmp= ch[i];
                ch[i] = ch[i+1];
                ch[i+1]=tmp;
            }
        }
        System.out.println(Arrays.toString(ch));
        return new String(ch);
    } 
}
