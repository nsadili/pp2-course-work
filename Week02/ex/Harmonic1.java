import java.util.Scanner;
public class Harmonic1 {
    public static void main(String[] args) {
    System.out.println("Enter the number of terms:");
     Scanner sc= new Scanner(System.in);
    
     int n= sc.nextInt();
     double sum =1.0;
     for(int i=1;i<=n;i++){
       sum += 1.0/i;


     }
     System.out.println("The harmonic series upto: "+n+"terms is :"+sum);
}

}
