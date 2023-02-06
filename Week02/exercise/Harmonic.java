import java.util.Scanner;

public class Harmonic{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter a number: ");
        var n = scan.nextInt();

        double sum = 0.0;

        for(int i = 1; i <= n; i++){
           sum = sum + 1.0 / i;  
        }
        
        System.out.println(sum);
    }
 } 