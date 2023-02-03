import java.util.Scanner;

public class Average{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        var sum = 0; // if you write var, should initiale
        var count = 0;

        // in c while(scanf()==1){}
        while(scan.hasNextInt()){
            sum += scan.nextInt();
            count++;
        }

         // firsty, it turns sum into souble then execute division

        System.out.println(
             (count == 0) 
            ? "Please, enter at least a value"
            : (double) sum / count
    
        ); // for executing control d
        
    }
}
