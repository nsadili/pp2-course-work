import java.util.Scanner;

public class Prime {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int cntt=0;
        

        for (int i=2; i<n; i++){
            if (n%i==0) {
                cntt++;
                //System.out.println(cntt);
            }
        }
        
        if (cntt>0) System.out.println("No");
        else System.out.println("Yes");

    }
}
