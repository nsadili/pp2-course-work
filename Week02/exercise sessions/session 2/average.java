import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int sum = 0;
        int cnt = 0;

        while (input.hasNextInt()) {
            num = input.nextInt();
            sum += num;
            cnt++;    
        }

        var avg = sum / cnt;

        System.out.println(avg);

        input.close();
    }
}
