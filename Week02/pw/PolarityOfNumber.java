import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        if(a>0){
            System.out.println("Positive");
        }

        else if(a==0){
            System.out.println("Zero");
        }
        else System.out.println("Negative");
    }
}
