import java.util.Scanner;
public class PolarityOfNumber {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        sc.close();

        if (n>0.0) {System.out.println("Positive");}
        else if (n<0.0) {System.out.println("Negative"); }
        else {System.out.println("Neutral");}
        

    }
}