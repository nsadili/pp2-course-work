import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = scanner.nextLine();
        scanner.close();
        System.out.print("Sorted string: " + sort(string));
    }

    static String sort(String string) {
        char array[] = new char[string.length()];
        array = string.toCharArray();
        int temp;
        for(int i = 0; i < array.length; i++ ) {
            for(int j = i+1; j < array.length; j++) {
               if(array[i]>array[j]) {
                  temp = array[i];
                  array[i] = array[j];
                  array[j] = (char) temp;
               }
            }
        }
        return Arrays.toString(array);
    }
}
