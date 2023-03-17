package Week04;
import java.util.Scanner;
public class Substring {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    String string = sc.nextLine();
    String sub = sc.nextLine();
    System.out.println( subOrNot(string, sub));
    }
    public static int subOrNot(String string, String sub){
        for(int i =0; i< string.length() - sub.length(); i++){
            if (string.substring(i, i+sub.length()).equals(sub) ) {return i;}
        }
            return -1;
        

    }
    
}