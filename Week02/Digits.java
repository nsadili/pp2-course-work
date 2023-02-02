import java.util.Scanner;
class Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
            int sum = 0;
            int p = 1;
            int cnt = 0;
            int s = 0;
         if(i < 0) i = -i;
        while(i != 0){
            int d = i % 10;
            sum += d;
            p  *= d;
            cnt++;
            i /= 10;
        }
        System.out.println("sum : \n"+ sum);
        System.out.println("product : \n"+ p);
        double m = (double) sum / (double) cnt;
        System.out.println("Average : \n" + m);
        
     
   }
  
    }
