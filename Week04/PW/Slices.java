import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        
        System.out.println(word);
        
        for (int i = 1; i < word.length(); i++) {
            String slice1 = word.substring(0, i);
            String slice2 = word.substring(i);
            
            System.out.println(slice1 + " " + slice2);
        }
        
        
    }
}

}
