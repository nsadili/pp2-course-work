package Strings.pw;
import java.util.Scanner;

public class Slices {
    public static void main(String[] args){

Scanner scan=new Scanner(System.in);

String a= scan.nextLine();

str(a);

    }





    public static void str(String x){
    
    int n=x.length();
    String [] arr=new String[n];
for(int i=0;i<2;i++){
    for(int j=0;j<n;j++){
        System.out.print(x.substring(i,j)+" "); 
        System.out.println(x.substring(i+j,n));

}
}


    }

    }

