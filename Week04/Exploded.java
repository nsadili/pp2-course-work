import java.util.Scanner;

public class Exploded {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(exploded(str));

    }
    static String exploded(String str) {
    StringBuilder sb = new StringBuilder();
       for(int i=0; i<=str.length()-1; i++) {
        sb.append(str.substring(0, i+1));
        }
        return sb.toString();
    }
}
