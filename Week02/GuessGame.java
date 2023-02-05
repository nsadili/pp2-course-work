import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        Random ran= new Random();
        var a= ran.nextInt();
        System.out.println("Write your guess");
        while(scan.hasNextInt()){
            var x= scan.nextInt();
            if(x==a){
                System.out.println("You won :)");
                break;
            }
            else{
                if (x<a){System.out.println("Try higher number");}
                if (x>a){System.out.println("Try lower number");}
            }
        }
    }
}
