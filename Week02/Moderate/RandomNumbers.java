import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int head = 0;
        int tail = 0;

        for (int i = 1; i <= n; i++) {

            double randomNum = Math.random();

            if (randomNum < 0.5) {

                head++;

            } else {

                tail++;

            }

        }
        
        System.out.println("Possibility of head is:" + (double) head / n);
        System.out.println("Possibility of head is:" + (double) tail / n);

    }
}