import java.util.Scanner;

public class GuessGame 
{
    public static void main(String[] args) 
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the upper range -> ");
        a = sc.nextInt();

        int num = (int) (Math.random() * (a + 1));

        var gs = 0;
        var sc = 0;

        System.out.print("Please enter your guess -> ");
        while (sc.hasNextInt()) 
        {
          
            gs = sc.nextInt();
            sc++;

            if (gs > num) 
            {
                System.out.println("Higher");
            } else if (gs < num) 
            {
                System.out.println("Lower");
            } else {            
                System.out.printf("Game Over! \n Number is %d\n", num);
                System.out.println("Your score: " + sc);
                break;
            }
            
            
            System.out.print("Enter your guesss -> ");

        }
        System.out.println("Game Over");
        System.out.println("Number is: "+num);

    }

}