import java.util.Arrays;
import java.util.Scanner;

public class PW11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String string = scanner.nextLine();
        scanner.close();
        System.out.println(swap(string));
    }

    static String swap(String string) {
        String[] strings = string.split(" ");
        System.out.println(Arrays.toString(strings));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            char[] array = strings[i].toCharArray();
            int last = array.length-1;
            char temp = array[0];
            array[0] = array[last];
            array[last] = temp;
            strings[i] = Arrays.toString(array);
            stringBuilder.append(array);
            stringBuilder.append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }
}
