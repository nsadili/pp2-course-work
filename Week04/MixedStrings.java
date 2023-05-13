import java.util.Arrays;
import java.util.Scanner;

public class MixedString 
{
    public static void main(String[] args) 
    {
        System.out.println("Please enter the input");
        String s=new Scanner(System.in).nextLine();
        
        System.out.println(mix(s));   
    }

    public static String mix(String s)
    {
        var stringArr = s.split(" ");

        StringBuilder res = new StringBuilder();

        for(var i = 0; i < stringArr.length; i++)
        {
          stringArr[i]=reverse(stringArr[i]);
        }
        return String.join(" ",stringArr);
    }


    public static String reverse(String s)
    {
        var sArr=s.toCharArray();
       
            char temp=sArr[0];
            sArr[0]=sArr[sArr.length-1];
            sArr[sArr.length-1]=temp;        

        return new String(sArr);
    }
}