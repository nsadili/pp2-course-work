import java.util.Scanner;
public class RandomPointsInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            var a = Math.random();
            var b = Math.random();
            System.out.printf("(%.2f, %.2f)\n", a, b);
        }
    }
}
