import java.util.*;
public class PrintingPatterns {    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = 5;
    int cnt = 1, i, j, sum;
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
            sum = i + j;
            if (sum % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print("#");
            }            }
        System.out.println();        }
}}