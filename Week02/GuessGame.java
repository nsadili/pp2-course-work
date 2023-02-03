import java.util.Scanner;

class Guessgame {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Maximum number: ");
    int A = sc.nextInt();
    int number = (int) (Math.random() * A + 1);
    int attempts;
    int userguess;
    attempts = 0;

    for(;;) {   
    System.out.print("Enter your guess: ");
    userguess = sc.nextInt();
    attempts++;
    if (userguess < number) {
        System.out.println("LOWER");
    } 
    else if (userguess > number) {
        System.out.println("HIGHER");
    }
    while (userguess != number);
        System.out.println("You won in " + attempts + " attempts!");
    }
  }
}