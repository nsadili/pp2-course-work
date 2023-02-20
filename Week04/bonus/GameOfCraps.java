import java.util.Scanner;
public class GameOfCraps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times do you want to play? --> ");
        int n = sc.nextInt();
        
        for (int i=0;i<n;i++){
            int j =i+1;
            System.out.println("ROUND " + j);
            var R =(int) (Math.random()*12+1);
            System.out.println("DICE NUMBER: " +R);

            if(R==7 || R==11) System.out.println("YOU WON!!!\n______________________");else
            if(R==2 || R ==3 || R==12) System.out.println("GAME OVER!\n______________________"); 
            
            else{
                    var B =(int) (Math.random()*12+1);
                    var R1 = (int) (Math.random()*12+1);
                    System.out.println("\nEstablished Dice: " + B);
                    System.out.println("The 2nd Dice: " + R1);
                    if (R1==B) System.out.println("YOU WON!!!\n______________________");
                    else if (R1==7) System.out.println("GAME OVER!\n______________________"); else System.out.println("DRAW\n______________________");
                }
            }
        }

        


}