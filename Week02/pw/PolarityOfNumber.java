import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {

     Scanner sc = new Scanner (System.in);
     float num = sc.nextFloat();
        if (num<0.0)
        System.out.println("negative");
       else  if (num>0.0)
        System.out.println("positive");
        else 
        System.out.println("neutral");
    }
}
