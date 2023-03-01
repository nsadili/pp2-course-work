import java.util.Scanner;
public class PolarityOfNumber {
    public static void main(String[] args) {
    Scanner sc = new  Scanner(System.in);
    double a = sc.nextDouble();
    if (a>0) 
    {
        System.out.println("Positive");
    }
    if (a<0) 
    {
        System.out.println("Negative");
    }
    if (a == 0) 
    {
        System.out.println("Neutral");
    }
}
}