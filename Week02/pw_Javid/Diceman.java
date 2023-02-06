import java.util.Scanner;   
import java.util.Random;

public class Diceman {
    public static void main(String[] args){

Scanner scan= new Scanner(System.in);

int a=scan.nextInt();
Random ran= new Random();

int random = ran.nextInt(6)+1;
int random2=ran.nextInt(6)+1;

if(a==0) {
System.out.print("Program is terminated");
}
else if(a<1 || a>12) System.out.print("Please enter value between 1 and 12");


else if(random+random2==a){
    System.out.print("Yes ");
    System.out.print(random+" "+random2);
}
else{ System.out.print("No ");
System.out.print(random+" "+random2);
}

    }


}
