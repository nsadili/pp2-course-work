import java.util.Scanner;

public class Primes {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();

    if (number <= 1){ 
    System.out.println(number + " is not a prime number.");
    return;
    }

    for (int i = 2; i <= Math.sqrt(number); i++){
    if (number % i == 0){
    System.out.println(number + " is not a prime number.");
    return;
        }
    }

        System.out.println(number + " is a prime number.");
    }
}
