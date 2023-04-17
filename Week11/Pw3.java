import java.util.Scanner;

public class Pw3{
    interface Calculator{

        int operation(int a, int b);

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        

        Calculator maximum = (int a, int b) -> (a>b) ? a : b;

        Calculator minimum = (int a, int b) -> (a<b) ? a : b;
        
        
        Calculator add = (int x, int y) -> (x+y);
        Calculator mult = (int x, int y) -> (x*y);
        Calculator sub = (int x, int y) -> (x-y);
        Calculator div = (int x, int y) -> (x/y);

        String str = scn.nextLine();
        String elements [] = str.split(" ");

       



    }
}