import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args){
        Scanner scan = new  Scanner(System.in);
        String input = scan.nextLine();
        char temp;
char[] input1 = input.toCharArray();
for(int i = 0; i<input.length();i++ )
for(int j=i+1; j<input.length();j++ ){
    if(input1[i]>input1[j]){
    temp=input1[i];
    input1[i]=input1[j];
    input1[j]=temp;
    }

}
    System.out.println("Sorted array" + Arrays.toString(input1));



    }
}







    

