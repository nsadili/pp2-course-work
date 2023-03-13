package week7;

import java.text.ParsePosition;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class ParseNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String exp1 = sc.nextLine();
        try{
            Parseint(exp1); 
        } catch(InvalidNumberException ine){
            System.out.println("Error: "+ ine.getMessage());
            ine.printStackTrace();
        } 

    }
    public static void Parseint(String smth) throws InvalidNumberException{
        String asdad = "";
        char[] toarray = smth.toCharArray();

        for(int i = 0; i < smth.length(); i++){
            if(smth.charAt(i) >= '0' && smth.charAt(i) <= '9' ){
                asdad += smth.charAt(i);
             }
        }
        if (asdad.equals("")){
              throw new InvalidNumberException("there is no number");
        }else System.out.println(asdad);
    }
}
