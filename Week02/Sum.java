import java.util.Scanner;

public class Sum 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //scanf

        int a = scan.nextInt();
        var b = scan.nextInt(); 

        var sum = a + b;

        //System.out.println(sum);
        System.out.printf("%d + %d = %d", a, b, sum);

        
    }
}