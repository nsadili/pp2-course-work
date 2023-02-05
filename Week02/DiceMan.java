import java.util.*;
import java.lang.Math;
import java.util.Random;
public class DiceMan {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            int n = sc.nextInt();

            int score_p=0;
            int score_c=0;
            while(n!=0){
                int rand12=rand.nextInt(11)+2;
                if(n<=1 || n>12) {
                    System.out.print("Number can't be obtained.\nPlease anter another one: ");
                    n = sc.nextInt();
                    continue;
                }
                System.out.println("Number on dice is: "+rand12);
                if(n==rand12) {
                    score_p++;
                    System.out.print("You win!");
                }
                else{
                    score_c++;
                    System.out.print("You lose!");
                }
                System.out.print("\nScore is: ");
                if(score_p>score_c)System.out.print(score_p+"-"+score_c+"\n You are leading!");
                else if(score_p<score_c) System.out.print(score_c+"-"+score_p+"\n Computer is leading :(");
                else System.out.print(score_p+"-"+score_c+"\n Draw!");
                System.out.println();
                n = sc.nextInt();
            }
        }
    }