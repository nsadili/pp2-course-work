import java.util.*;
public class MonthInfo {
    

    public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    switch(n){
        case 1:System.out.println("January"+ 31+" "+ "Winter");break;
        case 2:System.out.println("February"+ 29+ " "+"Winter");break;
        case 3:System.out.println("March"+ 31+" "+ "Spring");break;
        case 4:System.out.println("April"+ 30+ " "+"Spring");break;
        case 5:System.out.println("May"+ 31+ " "+"Spring");break;
        case 6:System.out.println("June" + 30+ " "+"Summer");break;
        case 7:System.out.println("July"+ 31+ " "+"Summer");break;
        case 8:System.out.println("August"+ 31+" "+ "Summer");break;
        case 9:System.out.println("September"+ 30+" "+ "Fall");break;
        case 10:System.out.println("October"+ 31+ " "+"Fall");break;
        case 11:System.out.println("November"+ 30+" "+ "Fall");break;
        case 12:System.out.println("December"+ 31+ " "+"Winter");break;
        
    }
    
    }
}

