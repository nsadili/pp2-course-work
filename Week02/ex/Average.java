import java.util.Scanner;

public class Average {
    
public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
     var cnt = 0;
     var sum = 0;

     while(scan.hasNextInt()) {
        sum += scan.nextInt();
        cnt++;
     }
     var avg = (double) sum / cnt;


     System.out.println(avg);
     System.out.printf("%.3lf\n", avg);
}

}
