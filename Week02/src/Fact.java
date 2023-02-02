import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        int fact = 1;
        for(int i = 1; i<=input; i++) {
            fact*=i;
        }
        System.out.println(fact);
    }
}
