import java.util.Scanner;
public class Average{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int count =0;
        int sum=0;
        while (scan.hasNextInt()){
            sum+= scan.nextInt();
            count++;
        }
        double a= (double)sum / (double)count;
        System.out.println(a);
    }
}