package Strings.pw;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main (String[] args){

Scanner scan =new Scanner(System.in);
String a= scan.nextLine();
String b= scan.nextLine();

if (anagrams(a,b)){
    System.out.println(a + " and " + b + " are anagrams");
}
else{
    System.out.println(a + " and " + b + " are not anagrams");
}

    }


    public static Boolean anagrams(String x,String y)
    {
char a[]=x.toCharArray();   
char b[]=y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);

    }
}
