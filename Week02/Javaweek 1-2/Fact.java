import java.util.Scanner;
public class Fact {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<0) System.out.println("ERROR");
        else {
            int factorial=1;
            while(a>0)
            {
                factorial= factorial*a;
                a--;
            }
                System.out.println(factorial);

        }

       
       
       
    }
    
}
