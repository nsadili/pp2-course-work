import java.util.Scanner;

public class Sum {
public static void main(String[] args){


    Scanner input = new Scanner(System.in);
    System.out.print("please, enter n1:");

    var a = input.nextInt();
    System.out.print("please, enter n2:");
    var b = input.nextInt();

    var s = a + b;
    System.out.println(s);



}
}