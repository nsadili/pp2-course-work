package Week04;
import java.util.Scanner;

public class Mixedstrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        print(mixedStrings(a));
        
    }
    public static String[] mixedStrings(String a) {
        String[] split = a.split(" ");
        String[] newA = new String[split.length];
        for(int i=0; i < split.length; i++){
            newA[i]=swapFirstAndLast(split[i]);
        }
        return newA;
    }
    public static String swapFirstAndLast(String s) {
        if(s.length()<2)
        return s;
        char[] c =s.toCharArray();
        swap(c, 0, c.length-1);
        return String.valueOf(c);
    }
    public static void swap(char[] c, int i, int j){
        char temp= c[j];
        c[j]=c[i];
        c[i]= temp;
    }
   

public static void print(String[] arr) {
    for (String s : arr) {
        System.out.print(s + " ");
    }
    System.out.println();
} }