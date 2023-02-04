import java.util.Scanner;
public class PrintingPatterns {
    public static void main (String[] args)
    {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int i,j;
    for (i=1;i<=n;i++)
    {
    for (j=1;j<=n;j++)
    {
    if ((j+i)%2==0) System.out.print("*");
    if ((j+i)%2!=0) System.out.print("#");
    }
  System.out.println();
    
}
}
    
}

