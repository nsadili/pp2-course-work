package Week2;
import java.util.*;
public class MonthInfo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
       switch(month){
            case 1: System.out.println("January" + 31); break;
            case 2: System.out.println("February" + 28); break;
            case 3: System.out.println("March" + 31);break;
            case 4: System.out.println("April" + 30);break;
            case 5: System.out.println("May" + 31);break;
            case 6: System.out.println("June" + 30);break;
            case 7: System.out.println("July" + 31);break;
            case 8: System.out.println("August" + 31);break;
            case 9: System.out.println("September" + 30);break;
            case 10: System.out.println("October" + 31);break;
            case 11: System.out.println("November" + 30);break;
            case 12: System.out.println("December" + 31);break;
        }
        switch(month){
            case 12:
            case 1:
            case 2:
            System.out.println("Winter"); break;
            case 3:
            case 4:
            case 5:
            System.out.println("Spring"); break;
            case 6:
            case 7:
            case 8:
            System.out.println("Summer"); break;
            case 9:
            case 10:
            case 11:
            System.out.println("Autumn"); break;
        }
        sc.close();

    }
}
