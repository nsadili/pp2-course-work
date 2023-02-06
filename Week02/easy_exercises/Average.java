import java.util.Scanner;

public class Average {
    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        int num;
        int sum = 0;
        int cnt = 0;

        while (input.hasNextInt()){
            num = input.nextInt();
            
            sum += num;
            cnt++;
        }

        var avg = (float)sum / cnt;

        System.out.println(avg);

    }
}