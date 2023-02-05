import java.util.Scanner;

public class Polarity {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        
        if (n>0.0) {System.out.println("Positive");}
        else if (n<0.0) {System.out.println("Negative"); }
        else {System.out.println("Neutral");}
        

    }
}
