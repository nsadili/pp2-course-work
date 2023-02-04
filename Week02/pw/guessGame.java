import java.util.Scanner;
public class guessGame {
    public static void main(String[] args){
        var obj = new Scanner(System.in);
        System.out.print("Enter a number A: \n");
        int num = obj.nextInt();
        System.out.print("Try to guess the number not bigger that A: ");
        int secretNum = (int)(Math.ceil(Math.random() * num));
        while(obj.hasNextInt()){
            int a = obj.nextInt();
            if(a==secretNum){
                System.out.print("Player wins!");
                break;
            }
            System.out.print("Try Again: ");
        }
    }
}
