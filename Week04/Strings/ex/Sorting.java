package Strings.ex;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);

        String a= scan.nextLine();
        String h= sorting(a);

        System.out.print(h);


    }

    public static String sorting(String s){
        char[] c= s.toCharArray();
        String [] x =new String[s.length()];

            for(int j=0;j<s.length();j++){

        for(int i=0;i<c.length;i++){

            if(c[j]<c[i]){

            x[j]=c[j];             
            }
            else{
                c[j]=c[i];
                x[j]=c[i];
            }

        }
    }

    x[0]="H";

return s;
    }
}
