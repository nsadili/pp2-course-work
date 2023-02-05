import java.util.*;
public class PrintingPatterns {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int i, j;
        for(i=1; i<=n;i++){
            for(j=1; j<=n; j++){
                if ((i+j)%2==0) System.out.print("*");
                else System.out.print("#");
            }
            System.out.println();
        }
    }
}
