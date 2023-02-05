import java.util.Scanner;

public class MinMax {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();

        

        float min = 10000;
        float max = 0;

        while(scan.nextFloat() != ' ') {

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            System.out.println(min);
            System.out.println(max);

        }
    }
}
