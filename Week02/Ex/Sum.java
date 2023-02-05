import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt(); 
        var n2 = scan.nextInt();
        var sum = n1 + n2;
        System.out.printf("%d + %d = %d", n1, n2, sum);
        
    }
}