import java.util.Scanner;
class SumOfOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int m = scan.nextInt();
        if(d < m){
            int sum = 0;
         for(int i = d; i <= m; i++){
             if(i % 2 != 0) sum+=i;
         }
         System.out.println(sum);
        }
        else if(d > m){
            int sum = 0;
            for(int i = m ; i < d; i++){
                if(i % 2 != 0) sum += i;
            }
            System.out.println(sum);
        }
        }
    }