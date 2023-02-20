import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        String b = scn.nextLine();
        System.out.println(anagramcheck(a, b));
    }
    public static boolean anagramcheck(String a, String b) {
        if(a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }
}




