import java.net.Socket;
import java.util.Scanner;
public class Sum {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("num1>");

    int a = input.nextInt();
    System.out.println("num2>");
    
    var b = input.nextInt();
    var sum = a + b ;

    System.out.println(sum);
    
}
}