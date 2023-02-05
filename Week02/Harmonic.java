import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        var n=scan.nextInt();
        var harmon=(double) 0;
        for (int i = 1; i <= n; i++) {
            harmon += (double) 1 / i;
        }
        System.out.println(n + "th Harmonic Number is " + harmon);
    }
}
