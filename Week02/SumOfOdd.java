import java.util.Scanner;

public class SumOfOdd
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 

        int a = scan.nextInt();
        var b = scan.nextInt(); 

        var sum =0;

        for(int i = a+1; i <= b-1; i++)
        {
            if(i % 2 !=0)
            sum +=i;
        }

        System.out.println(sum);


    }
}