import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String word = sc.nextLine();
        slice(word);
    }

    private static void slice(String s){

        for(var i=0;i<s.length();i++){
            System.out.println(s.substring(0,i)+' ' + s.substring(i));
        }

    }
}