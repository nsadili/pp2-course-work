import java.util.Scanner;
public class Average {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        var sum = 0;
        var count = 0;
        while (input.hasNextInt()){
        num = input.nextInt();
        
        sum += num;
        count++;
    }
    var avg = (float) sum / count;
    System.out.println(avg);
    
    }
}
