import java.util.Random;
import java.util.Scanner;

public class GameOfCraps{
    public static void main(String[] args) {
        System.out.println("Enter the number of rounds: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String result="";
        //n= number of rounds
        Random r= new Random();
        for(int i=0;i<n;i++){
            int p=0;
            int roll= rollDice(r);
            System.out.println("Roll #" +(i+1) + ": " + roll);
            if(roll==7 || roll ==11){
                result="Wins";
                System.out.println(result);
                


            } else if(roll==2 || roll==3 || roll==12){
                result ="Loses";
                System.out.println(result);
               

            } else{
                p =roll;
            }
            while(p !=0){
                roll= rollDice(r);
                System.out.println("Roll #"+(i+1)+": "+roll);
                if(roll == 7){
                    result ="Loses"; 
                    System.out.println(result);
                    break;
                } else if(roll==p){
                    result ="Win";
                    System.out.println(result);
                    break;
                }
            }



        }
    }
    private static int rollDice(Random r){
        int d1= r.nextInt(6)+1;
        int d2= r.nextInt(6)+1;
        return d1+d2;

    }
}