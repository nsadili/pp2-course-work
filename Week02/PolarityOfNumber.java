import java.util.*;

public class PolarityOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        if(n<0)
            System.out.print(n+" is negative");
        else if(n>0)System.out.print(n+" is positive");
        else System.out.print(n+" is neutral");
    }
}
