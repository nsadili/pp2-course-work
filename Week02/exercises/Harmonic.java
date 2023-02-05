import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add a number, please!");
        var n = sc.nextInt();
        var sum = 0.0;
        for (int i=1;i<=n;i++)

        {
            sum+=1.0/i;
        }
        System.out.println(sum);
    }
}