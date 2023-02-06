import java.util.Scanner;

public class Digits {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     System.out.print("Please, enter a number: ");
     var n = scan.nextInt();
     var copyn = n;

     if (n < 0)
     n = -n;


     int dig;
     int sum = 0;
     int cnt = 0;
     int product = 1;
     while(n > 0) {
        dig = n % 10;
        sum += dig;
        cnt++;
        product *= dig;

        n /= 10;
     }

      var avg = copyn != 0 
      ?(double) sum / cnt 
      : 0.0;

      product = copyn !=0
      ? product: 0;
      System.out.printf("Num = %d, Sum = %d, Product = %d, Avg = %f\n", copyn, sum, product, avg);

      

    }
}
