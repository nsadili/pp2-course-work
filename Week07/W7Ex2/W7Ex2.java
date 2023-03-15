import java.util.Scanner;

public class W7Ex2 {

public class Main { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a non-negative integer: "); 
        int n = scanner.nextInt();
        scanner.close(); 

        try { 
            long result = Factorial.factorial(n); // storing the result of factorial method in a long variable
            System.out.println(n + "! = " + result);
        } catch (IllegalArgumentException e) { // if an IllegalArgumentException is thrown, catch it and execute the following block of code
            System.out.println("Error: " + e.getMessage()); // error -- describes the exception
        }
    }
}

class Factorial { 

    public static long factorial(int n) {
        if (n < 0) { // if the integer < 0, throw an IllegalArgumentException
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        long result = 1; 

        while (n > 1) { 
            result *= n;
            n--; 
        }

        return result; // return the final value of result
    }
}

}
