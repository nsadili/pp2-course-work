package Week04.PW;


import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string.");
        printSlices(sc.nextLine());
    }

    public static void printSlices(String str) {
        if (str.length() < 2) {
            System.out.println("Error: Not possible to slice.");
            return;
        }
        for (int i = 1; i < str.length(); i++) {
            System.out.println(str.substring(0, i) + " " + str.substring(i));
        }
    }
}
