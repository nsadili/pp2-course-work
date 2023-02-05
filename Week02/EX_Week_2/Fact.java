import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Fact{
    public static void main(String[] args) throws Exception {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
        int product= 1;
            if(a>0){
            for(int i=1; i<=a; i++){
                product= product*i;

                }
                System.out.println(product);
                
            }
            else if(a==0){
                System.out.println(1);
            }
            else{
                System.out.println("Invalid input");
            }
            
        
    
        

    }
}


