import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {

        int sum = 0;

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int start = Math.min(a,b);
    int end = Math.max(a,b);

    for(int i = start; i <+ end; i++) {
       if( i % 2 == 1){
        sum+=i;

       }



    }

    System.out.println(sum);

        
    } 
        
    
}
