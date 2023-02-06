import java.util.Scanner;

public class PrintingPatterns {
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if ((i + j) % 2 == 0) {

                    System.out.print("*");

                } else {

                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
