import java.util.Scanner;

public class PolarityOfNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        var n = scan.nextDouble();
    

    if (n == 0.0) {
        System.out.println("Neutral!");
    }
    else if (n > 0.0) {
    System.out.println("Positive!"); 
    }
       else {
            System.out.println("Negative!");
        }
}
}

