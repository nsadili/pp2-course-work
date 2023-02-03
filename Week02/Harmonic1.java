import java.util.Scanner;

public class Harmonic1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        sc.close();

        double sum = 1;

        for (int i = 2; i <=n; i++){
            sum += 1.0/ i;
        }

        System.out.println("The harmonic series upto " +n + " terms is: " +sum);
    }
}