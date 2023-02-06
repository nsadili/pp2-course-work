import java.util.*;
public class PolarityOfNumber {public static void main(String[] args) {
    {        Scanner scn = new Scanner(System.in);
        double number = scn.nextDouble();
        if (number > 0)System.out.print("positive");
        if (number < 0)    System.out.print("negative");
        if (number == 0)    System.out.print("neutral");
        }
    }
}