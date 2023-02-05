import java.util.Scanner;
public class PolarityOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        if(a>0) System.out.println("Positive");
        else if(a<0) System.out.println("Negative");
        else System.out.println("Neutral");
    }
}
