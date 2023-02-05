import java.util.Scanner;
public class LapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();  
        if(year%4==0) {
            System.out.println(year+" is a lap year");
        }
        else {
            System.out.println(year+" is not a lap year");
        }

    }


}