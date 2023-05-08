import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scn.nextLine();
        int counter = 0;
        for(int i = 0; i < str.length(); i++) {
            
            if(Character.isLetter(str.charAt(i))) {
                counter++;
            }
            else{
                Exception e = new Exception("The string contains non-letter characters");
                throw e;
            }

        }
        System.out.println("The number of letters is " + counter);
    }
}