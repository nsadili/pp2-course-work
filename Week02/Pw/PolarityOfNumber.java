import java.util.Scanner;
public class PolarityOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double res = input.nextDouble();
        if(res>0) {
            System.out.println("Number is positive");
        }
        if(res==0) {
            System.out.println("Number is neutral");
        }
        if(res<0) {
            System.out.println("Number is negative");
        }
    }
}
