package Week02;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            // New Comment
            case 1:
            case 2:
            case 3: System.out.println("Spring");break;
            case 4:
            case 5:
            case 6: System.out.println("Summer");
            case 7:
            case 9: System.out.println("Autumn");break;
            case 10:
            case 11:
            case 13:
            case 12: System.out.println("Winter");break;
        }
    }
}
