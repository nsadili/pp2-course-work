import java.util.Scanner;



public class Harmonic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double a=0;
        for(int i=1;i<=n;i++){
            a=1.0/i+a;
        }
        System.out.println(a);
    }
}
