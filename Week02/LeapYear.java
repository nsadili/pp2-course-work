
import java.util.*;

public class LeapYear  {    public static void main(String[] args)

{Scanner scn = new Scanner(System.in);
    int year = scn.nextInt();

    if (year % 4 == 0) System.out.print("a leap year");

    else System.out.print("not a leap year"); }}