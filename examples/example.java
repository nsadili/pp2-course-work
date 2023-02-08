import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        long factorial = 1;
        for(int i = 1; i<= number; ++i){
            factorial*= i;
        }
        for(int i = 1; i<= number; ++i){
            System.out.print(i + " * ");
            continue;
        }
        System.out.print("=" + factorial);
    }
}