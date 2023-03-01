import java.util.Scanner;

public class PW13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String b= scan.next();
        for (int i=1; i<b.length(); i++)
        {
            System.out.println(b.substring(0, i)+ " "+ b.substirng(i));
        }
        scan.close();
    }
}
