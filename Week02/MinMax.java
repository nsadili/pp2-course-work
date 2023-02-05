 import java.util.Scanner;
public class MinMax {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int min=1000000;
        int max=0;
        while(scan.hasNextInt()){
            if(min>scan.nextInt()) min = scan.nextInt();
            if(max<scan.nextInt()) max = scan.nextInt();
        }
        System.out.println("minimum:"+min);
        System.out.println("maximum:"+max);
}
}