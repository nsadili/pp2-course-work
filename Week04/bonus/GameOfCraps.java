import java.util.Scanner;
public class GameOfCraps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var R =(int) (Math.random()*12+1);

        System.out.println("DICE NUMBER: " +R);
        if(R==7 || R==11) System.out.println("YOU WON!!!");else
                if(R==2 || R ==3 || R==12) System.out.println("GAME OVER!"); else{
                    var B =(int) (Math.random()*12+1);
                    var R1 = (int) (Math.random()*12+1);
                    System.out.println("Established Dice: " + B);
                    System.out.println("The 2nd Dice: " + R1);
                    if (R1==B) System.out.println("YOU WON!!!");
                    else if (R1==7) System.out.println("GAME OVER!"); else System.out.println("\nDRAW\n");
                }

        }

        


}