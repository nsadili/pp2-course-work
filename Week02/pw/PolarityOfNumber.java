// package Week02.pw;
import java.util.Scanner;
public class PolarityOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Positive");
        }
        else if(num > 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Neutral");
        }
    }
}
