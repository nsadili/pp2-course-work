package pp2.week11;
import java.util.*;
public class Calculator {
    interface calculator {
        int operation (int a,int b);
    }
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        calculator add=(int x,int y) -> x+y;
        calculator sub = (int x,int y) -> x-y;
        calculator mul = (int x,int y) -> x*y;
        calculator div = (int x,int y) -> x/y;

        String str = scn.nextLine();
        System.out.println (str);
        String elements [] = str.split(" ");
        for (String str2: elements ){
            System.out.print(str2+"\n");
        }
        int num1=0,num2=0,sum;
        String oper=" ";
        for (int i=0;i<elements.length;i++){
            if (i%2!=0)  num1=Integer.parseInt(elements[i]);
            if (i%2==0){
                oper=elements[i];
                num2=Integer.parseInt(elements[i+1]);
                i++;
            }
            if (oper.equals("+")){
                sum = add.operation(num1,num2);   }
            if (oper.equals("-")){
                sum =sub.operation(num1,num2);
            }    if (oper.equals("+")){
                sum = mul.operation(num1,num2);    }
            if (oper.equals("+")){
                sum = div.operation(num1,num2);
            }

        }
    }
}

