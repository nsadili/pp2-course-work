import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int count = 0;
        String[] words = str.split("\\s+");
        for (String word : words) {
            try {
                Integer.parseInt(word);
                continue; 
            } catch (NumberFormatException e) {
                
            }
            boolean isWord = true;
            for (char c : word.toCharArray()) {
                if (!Character.isLetter(c)) {
                    isWord = false;
                    break;
                }
            }
            if (isWord) {
                count++;
            }
        }

        System.out.println("Number of words in the string: " + count);
    }
}
