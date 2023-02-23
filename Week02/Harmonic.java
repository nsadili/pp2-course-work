import java.util.Scanner;

public class Harmonic{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numberof terms: ");
        int n = sc.nextInt();
        sc.close();

        double sum = 1;
        for(int i = 2;i <= n; i++){
            sum += 1.0/i;
        }
        System.out.println("The harmonic series up to" + n + "terms is: 1" + sum);
    }
} 