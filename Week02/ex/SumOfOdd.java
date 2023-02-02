import java.util.Scanner;

public class SumOfOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        var a = Integer.parseInt(args[0]);
        var b = Integer.parseInt(args[1]);

        var sum = 0;

        while(a < b) {

            if(a % 2 != 0)
            sum += a;
            a++;
        
        }

        System.out.println(sum);
    }
    
}
