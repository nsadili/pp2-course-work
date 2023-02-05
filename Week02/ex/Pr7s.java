import java.util.Scanner;

public class Pr7s {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = 7; // m = scan.nextInt()

        scan.close();

        for (int i = 0; i < n; i++)
            System.out.print(i % m + 1 + " ");

        System.out.println();

        boolean inc = true;
        for (int i = 0; i < n; i++) {   
            if (inc)
                System.out.print(i % m + 1 + " ");
            else
                System.out.print(m - i % m + " ");

            if ((i + 1) % m == 0)
                inc = !inc;
        }

    }
}
