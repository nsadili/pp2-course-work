import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
        do{
            System.out.println("The result is: " + i++);
        }while(i < 5);
        System.out.println("Done!");
        sc.close();
    }
}
