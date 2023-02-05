import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the upper bound -> ");
        a=sc.nextInt();

        int num=(int)(Math.random()*(a+1));  
        
        var guess=0;

        do{
            System.out.print("Please enter your guess -> ");
            guess=sc.nextInt();

            if(guess>num){
                System.out.println("Higher");
            }else if(guess<num){
                System.out.println("Lower");
            }else{
                System.out.printf("Game Over!\nNumber is %d",num);
            }


        }while(guess!=num );

    }
    
}
