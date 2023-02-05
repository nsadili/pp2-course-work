import java.util.Scanner;

public class ProductTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(i + " | ");
            for(int j=1; j<=n; j++){
                if(i*j < 10){
                    System.out.print("  "+i*j);
                } else if (i*j>=10){
                    System.out.print(" "+i*j);
                }
            }
            System.out.println();
        }
    }
}
