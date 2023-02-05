import java.util.Scanner;

class SumOfOdds {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int sum = 0;

    if(a < b)
    {
        for(int i = a; i < b; i++)
        {
            if(i % 2 != 0)
            {
                sum += i;
            }

        }
    }
    if(a > b)
    {
        for(int i = a; i > b; i--)
        {
            if(i % 2 != 0)
            {
                sum += i;
            }
        }
    }
    scanner.close();
      

     
  }
}
