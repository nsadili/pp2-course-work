import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        
        printSlices(word);
    }
     
    
    public static void printSlices(String word) {
        for (int i = 1; i < word.length(); i++) {
            String slice1 = word.substring(0, i);
            String slice2 = word.substring(i);
            System.out.println(slice1 + " " + slice2);
        }
    }

    
}