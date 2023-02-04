import java.util.Scanner;
public class polarityOfNumber {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        double num  = obj.nextDouble();
        if(num < 0){
            System.out.println("negative");
        }else if(num == 0){
            System.out.println("neutral");
        }else{
            System.out.println("Positive");
        }
    }
}
