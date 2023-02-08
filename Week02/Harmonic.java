package Week2;
import java.util.*;
public class Harmonic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double nth = 0f;
        for(int i=n; i>0; i--){
            nth+=(double)1/i;
        }
        System.out.print(nth);
        sc.close();
    }
}
