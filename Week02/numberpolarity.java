import java.util.Scanner ;

public class numberpolarity {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter a double number ");
        double num = scanner.nextDouble() ;
        if (num < 0) {
        System.out.println("Negative"); 
    }
        else if (num > 0) {
        System.out.println("Positive"); 
    }
        else {
        System.out.println("Neutral"); 
        }

    }    
}
}
