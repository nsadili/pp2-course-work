import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your name");
            String yourName = sc.nextLine();
        
        System.out.println("Enter how old are you");
            int yourAge = sc.nextInt();
        
        System.out.println("Enter how tall are you");
            double yourHeight = sc.nextDouble();
        
            
        System.out.println("Username is: " + yourName);
        System.out.println("Your age is: " + yourAge);
        System.out.println("Your height is: " + yourHeight);
        
        sc.close(); // Close the Scanner object to release any system resources

    }

}
