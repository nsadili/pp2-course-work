import java.util.Scanner;
public class CoinTossing {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        double n = sc.nextDouble();
        int h=0, t=0;
        sc.close();

        for (int i=0; i<n; i++){
            double ran = Math.random();
            if (ran<0.5) h++;
            else t++;
        }
        System.out.printf("head is: %d\ntail is: %d\n", h, t);
        System.out.println("head probability is: "+ h/n);
        System.out.println("tail probability is: "+ t/n);

        
    }
    
}
