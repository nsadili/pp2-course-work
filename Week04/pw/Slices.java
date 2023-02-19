import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String gw = sc.nextLine();
        
        slice(gw);
    }


    private static void slice(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(0,i) + " " + str.substring(i));
        }

    }


}
