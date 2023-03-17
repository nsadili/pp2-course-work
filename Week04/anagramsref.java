package week04;
import java.util.Scanner;
public class anagramsref {
    public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    char[] alower = a.toLowerCase().toCharArray();
    
    char[] c  = new char[alower.length];

    for( int i = alower.length-1; i>=0; i-- ){
        c[alower.length-1-i] = alower[i];
    }
     if( new String(c).compareTo(new String(alower)) == 0 ) System.out.println("TRUE");
     if(new String(c).compareTo(new String(alower)) != 0 ) System.out.println("FALSE");
    sc.close();
    }
    
}