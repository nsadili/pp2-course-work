import java.util.Scanner;

public class DiceMan {
    public static void main(String[] args) {

        int user,x;
        
         do{
           
            Scanner sc=new Scanner(System.in);
            System.out.print("enter number-> ");
            user=sc.nextInt();

          

            if(user<11 || user>66 ){
                System.out.println("Please enter correct number");
                continue;
            }

             x=  (int) (Math.random()*6+1);

            // if( x==user){
            //     System.out.println("User wins");
            // }else{
            //     System.out.println("Computer wins");
            // }

            System.out.println(
                x==user ?  "User wins":  "Computer wins"
            );

         }while(user!=0);

         System.out.println("Game Over!");



    }
    
}
