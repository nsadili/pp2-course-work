import java.util.Scanner;

public class Main{
    interface Calculator{

        int operation(int a, int b);

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int max;
        int min;

        Calculator maximum = (int a, int b) -> (a>b) ? a : b;

        Calculator minimum = (int a, int b) -> (a<b) ? a : b;
        
        

        Calculator maxi = (int x, int y) ->{
            if(x>y) max = x;
            else max =y;
            return max;
        };
        
        Calculator mini = (int x, int y) ->{
            if(x<y) min = x;
            else min = y;
            return min;
        };
        
        Calculator add = (int x, int y) -> (x+y);
        Calculator mult = (int x, int y) -> (x*y);
        Calculator sub = (int x, int y) -> (x-y);
        Calculator div = (int x, int y) -> (x/y);

        String str = scn.nextLine();
        String elements [] = str.split(" ");

       



    }
}