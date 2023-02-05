import java.util.Scanner;

public class PrintingPatterns {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((i + j) % 2 != 0) System.out.print("#");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
