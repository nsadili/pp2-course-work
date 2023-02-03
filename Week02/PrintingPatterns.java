import java.util.Scanner;
class PrintingPat{
    public static void main(String[] args) {
       PrintingPatterns();
    }
    
    
    public static void PrintingPatterns(){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
       for(int i = 1; i <= m ; i++){
            for(int j = 1; j <= m ; j++){
                if((i + j) % 2 == 0) System.out.print("*");
                if((i + j) % 2 != 0) System.out.print("#");
            }
            System.out.print("\n");
       }
    }
}