//package Week02.ex;
import java.util.Scanner;
public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        
        while (true) {
            if (!(sc.hasNextDouble())){
                break;
            }
            
            double num = sc.nextDouble();
            count++;
            sum += num;
        }
        
        System.out.println((count == 0) ? "No input" : sum / count);
    }
}

