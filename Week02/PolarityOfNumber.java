import java.util.Scanner;

public class PolarityOfNumber {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Input your number: ");
      float number = in.nextInt();

    if(number>0){
      System.out.println("Positive");}

    else if(number<0){
      System.out.println("Negative");}
    
    else{
      System.out.println("Neutral");}

    };

}
