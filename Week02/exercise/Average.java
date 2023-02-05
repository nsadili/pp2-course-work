import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n;
        var sum = 0;
        var cnt = 0;

        while(scan.hasNextInt()){
            n = scan.nextInt();

            sum += n;
            cnt++;
        }
        if(cnt == 0){
            System.out.println(" Please, enter a value");
        }
        else{
             System.out.println((float) sum /cnt);
        }
    }
}
