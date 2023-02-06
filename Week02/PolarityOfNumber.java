import java.util.*;

public class PolarityOfNumber {    public static void main(String[] args)

{Scanner scn = new Scanner(System.in);

    double num = scn.nextDouble();

    if (num > 0) System.out.println("Positive");

    if (num < 0) System.out.println("Negative");

    if (num == 0) System.out.println("Neutral"); } }