import java.util.Scanner;

public class ArmstrongNumbersB
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        var b = scan.nextInt(); 

        // if lower and upper bounds are not specified , we can use "int lower = sc.nextInt();" or "int upper = sc.nextInt();" methods

        int count = 0;

        for(int i = a; i <= b; i++)
        {

            int original = i;
            int i2 = i;
            int sum = 0;
            

            while(i2 != 0)
            {
                 int digit = i2 % 10;
                 sum = sum + digit*digit*digit;
                 i2 = i2 / 10;

            }

            if(sum == original)
            {
                count++;
            }            

        }      
        
        System.out.println(count);



    }
}