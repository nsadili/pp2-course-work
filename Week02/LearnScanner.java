import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args){

        Scanner x = new Scanner(System.in);
        System.out.println("Enter your name");

        String yourName = x.nextLine();
        System.out.println("Username is: " + yourName);
    }

}
