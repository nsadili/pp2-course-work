import java.util.Scanner;   

public class MinMax {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        var mx=-99999.0;
        var mn=99999.0;
        System.out.println("Please add numbers!");
        while (sc.hasNextInt()){
            var n = sc.nextFloat();
            if (n>mx) mx=n;
            if (n<mn) mn=n;
        }
        System.out.printf("MAX: %f and MIN: %f", mx, mn);
    }
}