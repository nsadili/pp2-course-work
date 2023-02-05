import java.io.EOFException;
import java.util.*;
import java.lang.Math;
import java.util.Random;
public class GuessGame {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            System.out.print("Enter the number,which will be the upper bound of random integer: ");
            int a = sc.nextInt();
            int randn=rand.nextInt(a-1)+1;
            int cnt=1;
            int flag=0;
            System.out.println("Now enter the number you think computer chose(the game can be ended by entering -1): ");
            int n = sc.nextInt();
            while(n!=-1) {
                if(randn==n) {
                    System.out.println("You guessed it!\nIt took "+cnt+" attempt(s) to guess.");
                    flag=1;
                    break;
                }
                else if(randn<n) {
                    System.out.println("Wrong! The number is less than " + n); cnt++;}
                else {System.out.println("Wrong! The number is bigger than " + n);cnt++;}
                n = sc.nextInt();
            }
            if(flag==1){
                if(cnt<=10)System.out.println("Great job!");
                else if(cnt<=20)System.out.println("Decently done!");
                else System.out.println("Might need to work on intuition!");
            }
        }
    }


