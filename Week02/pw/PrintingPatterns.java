import java.util.Scanner;
public class PrintingPatterns {
    public static void main(String[] args) {
      Scanner scan= new Scanner (System.in);
      long n= scan.nextLong();
      for(int i=1; i<=n;i++){
        for(int j=1;j<=n;j++){
            if((i+j)%2==0){
                System.out.print("*");
            }
            else {
                System.out.print("#");
            }
        }
        System.out.printf("\n");
      }
        
    }
}
