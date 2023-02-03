import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var sum=0; 
        var cnt=0;
        while(scan.hasNextInt()) {
            sum += scan.nextInt();
            cnt++;
        }
        System.out.println(
            (cnt==0)
            ? "Please,enter at least a value"
            : (double) sum/cnt
        );
    }
}
