package EX;
import java.util.Arrays;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Print something here: ");
        String input = scan.nextLine();  
        System.out.println("Sorted string: " + sortString(input)); 
        scan.close();
    }

    // methods
    public static String sortString(String input){
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        return sortedString;
    }
}