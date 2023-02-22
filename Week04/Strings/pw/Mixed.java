package Strings.pw;
import java.util.Scanner;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Mixed {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
  String str= scan.nextLine();
String [] arr= str.split(" ");
int n=arr.length;
Sting(str,n);



}
    
    public static String Sting (String s,int z){
        String [] arr= s.split(" ");
        
        
        
            String temp=arr[0];
          arr[0]=arr[z-1];
          arr[z-1]=temp;
        
        for(int i=0;i<z;i++){
            System.out.print(arr[i]+" ");
        }
       
    return s;
    
}}
