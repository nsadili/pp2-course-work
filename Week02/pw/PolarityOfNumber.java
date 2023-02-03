import java.util.Scanner;
public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double x= scn.nextDouble();
        if(x>0.0){
            System.out.println("Our number is positive");
        }
        else if(x<0.0){
            System.out.println("Our number is negative");
        }
        else {
            System.out.println("Our number is neutral");
        }
    }
    
}
