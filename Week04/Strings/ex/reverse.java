package Strings.ex;

import java.util.Scanner;

public class reverse {

public static void main(String[] args){

Scanner scan=new Scanner(System.in);
String z=scan.nextLine();   
String r=reverseString(z);
System.out.println(r);

}
public static String reverseString(String s) {
    StringBuilder sb = new StringBuilder(s);
    return sb.reverse().toString();
}
}


