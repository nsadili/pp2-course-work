import java.util.Scanner;
public class PrintingPatterns {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for (int i = 1; i <= n; i++)
    {
        for (int j =1 ; j <= n; j++)
        {
            if (i%2==1 && j%2==1) System.out.print("*");
            else if(i%2==0 && j%2==0) System.out.print("*");
            else System.out.print("#");
        }
        System.out.println();
    }
}

}