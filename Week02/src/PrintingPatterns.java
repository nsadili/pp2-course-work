import java.util.Scanner;

public class PrintingPatterns {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i%2==0){
                    if(j%2==0){
                        System.out.print("# ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    if(j%2==0){
                        System.out.print("* ");
                    } else {
                        System.out.print("# ");
                    }
                }
            }
            System.out.println();
        }
    }
}
