import java.util.Scanner;

public class Task14Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        int flag = 0;
        for(int i=0;i<a.length();i++) {
            if(a.charAt(i) == b.charAt(i)) { // same indexes
                System.out.print(a.charAt(i));
                flag = i; // latest occurence index
            }
            else {
                if(i == flag + 1)
                    System.out.println();
            }
        }
        scan.close();
    }
}
