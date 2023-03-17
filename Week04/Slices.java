package week04;
import java.util.Scanner;
public class Slices {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String Slice = sc.nextLine();
        slices(Slice);
    }
    public static void slices(String slices){
        System.out.println(" "+slices);
         for(int i =0; i <= slices.length(); i++ ){
            System.out.println(slices.substring(0, i + 1)+" " + slices.substring( i + 1));

        }
    }
    
}