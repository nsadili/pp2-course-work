import java.util.Scanner;

public class Monthinfo {
    public static void main (String[] args){
        
        Scanner scan = new Scanner (System.in);

        var no = scan.nextInt();
        
        switch(no) {
            case 1: System.out.println("Jan");
            break;
            case 2: System.out.println("Feb");
            break;
            case 3: System.out.println("Mar");
            break;
            default: System.out.println("enter a valid month number");
        }

    }
}
