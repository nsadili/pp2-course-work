import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number:");
        int x = sc.nextInt();

        if(x == 1)
        System.out.println("One");
        else if(x == 2)
        System.out.println("Two");
        else
        System.out.println("More");

        sc.close();

    }
}
