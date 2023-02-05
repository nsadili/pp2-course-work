import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int fakt = 1;

        if (num < 0) {

            System.out.println("error");
        } else {

            while (num > 1) {

                fakt = fakt * num;

                num--;
            }

            System.out.println(fakt);
        }
    }

}
