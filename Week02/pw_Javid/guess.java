import java.util.Scanner;
import java.util.Random;
public class guess{
    public static void main(String[] args){
        Scanner Scan= new Scanner(System.in);
        
        
        int b = Scan.nextInt();

        Random ran=new Random();
        int cnt1=0,cnt2=0;
        while(Scan.hasNextInt()){
           
            int random=ran.nextInt(b);

        if (random==Scan.nextInt()){
            System.out.println("You won");
            cnt1++;

        }
        else{
            System.out.println("You lost");
            cnt2++;

        }
        System.out.println(" ");
        System.out.println("Attempts: " + (cnt1+cnt2));
        System.out.println("Win: " + (cnt1));
        System.out.println("Lost: " + (cnt2) );
    }
    }

}