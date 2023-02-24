package Week04.PW_13;

import java.util.Scanner;

public class Slices {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Print something: ");
        String str = scan.nextLine();
        scan.close();
        slices(str);
    }

    public static void slices(String str){
        for (int i = 0; i < str.length() - 1; i++){
            System.out.println(str.substring(0, i) + " " + str.substring(i, str.length()));
        }
    }
}