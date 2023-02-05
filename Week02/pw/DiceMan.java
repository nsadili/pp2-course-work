import java.util.Scanner;
public class DiceMan {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to our Dice Man Game!");
        System.out.println("Please enter a number between 1-12!");
        int player = sc.nextInt();
        if (player==0) System.exit(player);
        if (player>12) System.out.println("INVALID NUMBER! - Please enter a number between 1-12!");
        double random = Math.random();
        int computer = 0;
        if (player<=12 && player>1){
        if (random<1.0/12) computer=1;
        if (random<2.0/12) computer=2;
        if (random<3.0/12) computer=3;
        if (random<4.0/12) computer=4;
        if (random<5.0/12) computer=5;
        if (random<6.0/12) computer=6;
        if (random<7.0/12) computer=7;
        if (random<8.0/12) computer=8;
        if (random<9.0/12) computer=9;
        if (random<10.0/12) computer=10;
        if (random<11.0/12) computer=11;else computer=12;


        if (player==computer) System.out.println("You Won!");
        else {
            System.out.println("Game Over!");
            System.out.printf("The number was %d", computer);
        }
    }
    }
}
