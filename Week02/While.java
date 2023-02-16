import java.util.Scanner;

public class While {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
        while(i < 5){
            System.out.println("The result is: " + i++);
        }
        System.out.println("Done!");
        sc.close();
    }
}
