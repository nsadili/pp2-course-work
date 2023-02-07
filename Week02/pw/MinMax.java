import java.util.Scanner;
import java.io.IOException;
import java.lang.*;
public class MinMax {
    
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);

        float num = scan.nextFloat();

        int min = 1000;
        int max = 0;

        int m = (int)num;

        while(scan.hasNextInt()) {
          
        char symbol = (char) System.in.read();

              if (symbol < min) 
                min = symbol;
            scan.hasNextInt();
        

              if (symbol > max) 
                max = symbol;
                scan.hasNextInt();
        }
            
            System.out.println(min);
            System.out.println(max);

        }
    }
