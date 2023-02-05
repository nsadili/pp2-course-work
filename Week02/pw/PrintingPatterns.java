import java.util.Scanner;

public class PrintingPatterns {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if((i+j)%2==0){System.out.print("# ");
                 }
                    else
                    System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
