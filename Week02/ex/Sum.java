import java.util.Scanner;

public class Sum {
public static void main(String[] args){


    Scanner input = new Scanner(System.in);
    System.out.print("please, enter num 1:");

    var a = input.nextInt();
    System.out.print("please, enter num 2:");
    var b = input.nextInt();

    var sum = a + b;
    System.out.println(sum);



}
}