import java.util.Scanner;
public class Sum{
    public static void main(String[] args){

try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter num1:");
    int a = sc.nextInt();
    System.out.print("Enter num2:");
    var b = sc.nextInt();
    
    var sum =a + b;
    
    System.out.println(sum);
}
    }
}