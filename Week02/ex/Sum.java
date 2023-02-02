import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        var num1 = scan.nextInt();
        var num2 = scan.nextInt();

        var sum = num1 + num2;

        System.out.println(sum);

    }
}
