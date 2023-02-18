import java.util.Arrays;
import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String n= scn.next();
        
        System.out.println("Exploded string is: "+ sort(n));
    
    }
    public static String sort(String str){
        char[] arr= str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
