import java.util.Random;
import java.util.Scanner;

public class GameOfCraps {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Random random=new Random();
        int die1;
        int die2;
        int sum;
        String result;
        System.out.println("How many time would you like to play?");
        int cnt=scan.nextInt();
        while(cnt>0){
            System.out.printf("\nSTART");
            cnt--;
            die1=random.nextInt(5)+1;
            die2=random.nextInt(5)+1;
            sum=die1+die2;
            System.out.println("1st Die: "+die1+" 2nd Die: "+die2);
            if(die1+die2==7 || die1+die2==11) {
                System.out.println("You Won");
                break;
            }
            if(die1+die2==2 || die1+die2==3 || die1+die2==12) {
                System.out.println("You Lost");
                break;
            }
            else{
                System.out.println("Die are rolled one more time");
                while(true){
                    boolean flag=false;
                    die1=random.nextInt(5)+1;
                    die2=random.nextInt(5)+1;
                    System.out.println("1st Die: "+die1+" 2nd Die: "+die2);
                    if(die1+die2==sum){
                        System.out.println("You Won");
                        flag=true;
                        break;
                    }
                    if(die1+die2==7){
                        System.out.println("Seven Out");
                        flag=true;
                        break;
                    }
                    else {
                    System.out.println("Die are rolled one more time");
                    
                    }
                    if(flag) break;
                }
            }

        }
    }
}
