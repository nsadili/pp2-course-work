package PackageTwo;

import java.util.Scanner;

public class W2Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of month: ");
        int x = sc.nextInt();
        sc.nextLine();

        sc.close();

        if(x > 12) x %= 12;
        
        switch(x){
            case 1:
            System.out.print("January ");
            break;
            case 2:
            System.out.print("February ");
            break;
            case 3:
            System.out.print("March ");
            break;
            case 4:
            System.out.print("April ");
            break;
            case 5:
            System.out.print("May ");
            break;
            case 6:
            System.out.print("June ");
            break;
            case 7:
            System.out.print("July ");
            break;
            case 8:
            System.out.print("August ");
            break;
            case 9:
            System.out.print("September ");
            break;
            case 10:
            System.out.print("October ");
            break;
            case 11:
            System.out.print("November ");
            break;
            case 12:
            System.out.print("December ");
            break;
        }

        if(x == 9 | x == 11) System.out.println("30 days");
        else
        if(x == 8 | x == 10 | x == 12) System.out.println("31 days");
        else
        if(x == 2) System.out.println("28 days");
        else
        if(x % 2 == 1) System.out.println("31 days");
        else 
        if(x % 2 == 0 ) System.out.println("30 days");
    }    
}
