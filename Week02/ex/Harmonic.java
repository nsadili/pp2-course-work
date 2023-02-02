import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        System.out.print("Enter number please :");
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        double sum= 0.0;
       for(int i=1; i<=n;i++){
        sum=sum+1.0/i;

       }
       System.out.println("Our answer is :"+sum);

    }
    
}
