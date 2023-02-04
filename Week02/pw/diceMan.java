import java.util.Scanner;
public class diceMan{
    public static void main(String[] args){
        var obj = new Scanner(System.in);
        System.out.print("Enter number [1;12]\n");
        int num = obj.nextInt();

        while(num!=0){
            int dice1 = (int)(Math.ceil(Math.random() * 6));
            int dice2 = (int)(Math.ceil(Math.random() * 6));
            if(dice1+dice2 == num){
                System.out.printf("player wins: %d+%d =%d\n",dice1,dice2,num);}
            else{System.out.printf("player loses: %d+%d !=%d\n",dice1,dice2,num);}
            System.out.print("Enter number [1;12]\n");
            num = obj.nextInt();
        }
    }
}