import java.util.Scanner;

public class ArmstrongNumbersB
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        var b = scan.nextInt(); 

        // if lower and upper bounds are not specified , we can use "int lower = sc.nextInt();" or "int upper = sc.nextInt();" methods

        var count = 0;

        for(int i = a; i <= b; i++)
        {

            int original = i;
            int sum = 0;

            while(i != 0)
            {
                 int digit = i % 10;
            sum = sum + digit*digit*digit;
            i = i / 10;

            }

            if(sum == original)
            {
                count++;
            }            

        }      
        
        System.out.println(count);



    }
}