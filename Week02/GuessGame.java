import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args){

        int user=0, competitor=0;
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Random random=new Random();
        int rndm=random.nextInt(n)+1;
        int cnt=0;
        
        while (sc.hasNext()){
            int m = sc.nextInt();
            if (m>rndm) {
                System.out.println("Lower!");
                cnt++;
            }
            else if (m<rndm) {
                 System.out.println("Higher!");
                cnt++;
            }
            else {
                System.out.println("Congratulations, you won.");
                System.out.println("Your score is: " + ((10*(n-cnt))/n));
                break;
            }
        }
        sc.close();
    }
}
