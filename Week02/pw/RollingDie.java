import java.util.Scanner;
public class RollingDie {
    public static void main(String[] args) {

    
double x= Math.random();
System.out.println("The value is"+x);
if(x<0.125){
    System.out.println(1);

} 
 else if(x<0.25){
    System.out.println(2);
 }
 else if(x<0.375){
    System.out.println(3);
 }
 else if(x<0.5){
    System.out.println(4);
 }
 else if(x<0.75){
    System.out.println(5);
 }
 else{
    System.out.println("Game is over");

 }


    }
}
