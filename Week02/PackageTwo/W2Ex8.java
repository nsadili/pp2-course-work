package PackageTwo;

import java.util.Scanner;

public class W2Ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        sc.nextLine();

        sc.close();

        if(a < b){
            int cnt1 = 0;
            int x = a + 1;
            while(x < b){
                if(x % 2 != 0){
                    cnt1 += x++;
                }
                x++;
            }
            System.out.println(cnt1);
        }else
        if(b < a){
            int cnt2 = 0;
            int y = b + 1;
            while(y < a){
                if(y % 2 != 0){
                    cnt2 += y++;
                }
                y++; 
            }
            System.out.println(cnt2);
    }    
}
}
