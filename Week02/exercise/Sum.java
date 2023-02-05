import java.util.Scanner;

public class Sum { 
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int x = scan.nextInt();
            var y = scan.nextInt();

            var sum = x + y;

            System.out.println(sum);
        }
    }
}