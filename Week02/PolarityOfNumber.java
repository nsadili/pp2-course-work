package Week2;
import java.util.*;
public class PolarityOfNumber {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
    if(n<0){
        System.out.println("Negative");
    }else if(n>0){
        System.out.println("Positive");
    }else{
        System.out.println("Neutral");
    }
    sc.close();
}
}
