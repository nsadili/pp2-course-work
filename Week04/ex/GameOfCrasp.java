import java.util.Random;
import java.util.Scanner;

public class GameOfCrasp {
   static int win=0;
   static int lose=0;

    public static void main(String[] args) {
        // Random r = new Random();

        // var num1 = r.nextInt(1, 7);
        // var num2 = r.nextInt(1, 7);
        // var total = num1 + num2;
        // var established=(int) (Math.random()*6+1);
       // System.out.println(established);
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of times you want to play: ");
        var times=sc.nextInt();
        for(var i=0;i<times;i++){
            System.out.printf("%d. game\n",(i+1));
            game();
           // System.out.println("");
            System.out.println("-----");
        }
        System.out.println("Game Over!");
        System.out.printf("You played %d times:  You Win: %d  You Lose: %d",times,win,lose);
     

    }

    public static void game() {

        Random r = new Random();
        
        var num1 = r.nextInt(1, 7);
        var num2 = r.nextInt(1, 7);
        var total = num1 + num2;

        if(total==7 || total==11){
            System.out.printf("Bet wins:\nDice 1: %d \nDice 2: %d\nTotalPoint: %d\n",num1,num2,total);
            win++;
        }else if(total==2 || total==3 || total==3){
            System.out.printf("Bet lose:\nDice 1: %d \nDice 2: %d\nTotalPoint: %d\n",num1,num2,total);
            lose++;
        }else{
            var established=(int) (Math.random()*12+1);
            System.out.println("Established Point: \n"+established);
            var round=1;

            while(true){
                
                var random=r.nextInt(1,7);
                var random2=r.nextInt(1,7);
                var total2=random+random2;
                System.out.println("Round: "+round++);
                if(total2==established){
                    System.out.printf("Bet wins: established: %d , randomPoint: %d\n",established,total2);
                    win++;
                    break;
                }
                if(total2==7){
                    System.out.printf("Seven out: Bet loses  randomPoint: %d\n",total2);
                    lose++;
                    break;
                }else{
                    System.out.println("No Win, No Lose");
                    System.out.printf("RandomPoint: %d\n",total2);
                }
              //  round++;
            }




            // do{

                


            // }while(r.nextInt(1,7)!=established || r.nextInt(1,7)!=7);

        }

    }
}
