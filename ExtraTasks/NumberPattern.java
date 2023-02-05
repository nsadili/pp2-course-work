import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sub = 1;
        int value = n*2-1;
        for(int j=1 ; j<n+1; j++) {
            for(int i=1; i<=value; i++){
                if(j==1){
                    if(i<=n) {
                        System.out.print(i+" ");
                    }
                    else if (i>=n) {
                        System.out.print(n-sub+" ");
                        sub++;
                    }
                }
                else {
                    if(i<n) {
                        System.out.print(i+" ");
                    }
                    else if (i==n) {
                        System.out.print("  ");
                    }
                    else if (i>n) {
                        System.out.print(n-sub+" ");
                        sub++;
                    }
                }
            }
            sub = 1;
            System.out.println();
        }
    }
}
