import java.util.Scanner;

public class Sumofodd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        if (args.length <2 ) {
            System.out.println("Please, enter 2 integer: ");
            System.exit(1);
        }
        var a = Integer.parseInt(args[0]);
        var b = Integer.parseInt(args[1]);

        
        
        if (b>a) {
        int sum = 0;
        for (int i=a+1; i<b; i++)
        if (i%2!=0){
        sum+=i;
        }
        System.out.println(sum);

        

            }
            if (b<a) {
                int sum = 0;
                for (int i=b+1; i<a; i++)
                if (i%2!=0){
                sum+=i;
                }
                System.out.println(sum);
                
                
        
                    }
        }
    
}
