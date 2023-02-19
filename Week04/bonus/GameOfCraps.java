import java.util.Random;

public class GameOfCraps {
    public static void main(String[] args) {
        Random ran=new Random();
        int dice1 = ran.nextInt(1, 7);
        int dice2 = ran.nextInt(1, 7);

        System.out.println("The come-out-roll: "+ (dice1+dice2));

        if (dice1+dice2==7 || dice1+dice2==11){
            System.out.println("The bet won!");
        }
        else if (dice1+dice2==2 || dice1+dice2==3 || dice1+dice2==12){
            System.out.println("Crapped out! The bet lost!");
        }
        else{
            int p=dice1+dice2;
            System.out.println("Point established: "+ p);
            for (;;){
                int dice11 = ran.nextInt(1, 7);
                int dice22 = ran.nextInt(1, 7);
                System.out.println((dice11+dice22));
                if (dice11+dice22==p){
                    System.out.println("The bet won");
                    break;
                }
                else if (dice11+dice22==7){
                    System.out.println("Sevened out! The bet lost!");
                    break;
                }
            }
        }
    }   
}
