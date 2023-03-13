package Week07;

import java.util.Scanner;

import javax.xml.transform.Source;

public class Factorial {
    public static void main(String[] args) {
        
    
    int res=1;
    Scanner scn=new Scanner(System.in);
    int a=scn.nextInt();
    try{
    if(a>0){
        for(int i=1;i<=a;i++){
            res=res*i;
        }
    System.out.println(res);
    }
    else if(a==0){
        System.out.println(1);
    }
    else if(a<0){
        throw new IllegalArgumentException("Number must be positive.");
    }
    }
    catch(IllegalArgumentException e){
        System.err.println("Error: "+e.getMessage());
        
    }
    }
}