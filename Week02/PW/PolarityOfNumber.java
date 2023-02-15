import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();

        if(num>0) {
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Neutral");
        }
    }
    
}
// [PolarityOfNumber.java] Given a double-precision floating-point number. Check and print
//its polarity (negative, positive, neutral = 0)
