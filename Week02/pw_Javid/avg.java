import java.util.Scanner;

public class avg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        float cnt=0;
        float sum=0;
        input.hasNextInt();

        while (input.hasNextInt()){

            cnt++;
            sum=sum+input.nextInt();
           
            
        }
       float res=sum/cnt;
        System.out.print(res);

    }
}