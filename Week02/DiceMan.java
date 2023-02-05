import java.util.Random;
import java.util.Scanner;

public class DiceMan {
    public static void main(String[] args){

        int user=0, competitor=0;
        Scanner sc = new Scanner (System.in);
        
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n==0) {
                System.out.println("Terminated");
                break;
            }
            else if (n>12 || n<2) System.out.println("Please input a number between 2 and 12!");
            else {
                
                Random random=new Random();
                int rndm=random.nextInt(11)+2;
                
                if (n==rndm) user++;
                else competitor++;
                System.out.println("user: "+user);
                System.out.println("competitor: "+competitor);
            }
        }
        sc.close();
    }
}
