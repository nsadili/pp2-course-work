import java.util.HashMap;
// import java.util.Iterator;
import java.util.Scanner;

public class MyAuthClass {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("rufetth", "12345678");
        hm.put("neriman", "qwerty");
        hm.put("shamil", "shamilll");
        hm.put("arzum", "arzm555");

        System.out.println("Please, enter the login.");
        Scanner sc = new Scanner(System.in);
        String login=sc.nextLine();
        if (!hm.containsKey(login)) {
            System.out.println("Non-existing login.");
            System.exit(0);
        }
        // System.out.println(hm.get(login));        
        System.out.println("Please, enter the password.");
        String password=sc.nextLine();

        if (hm.containsKey(login) && hm.get(login).equals(password)) {
            System.out.println("Logined successful!");
        }
        else System.out.println("Login failed (wrong password)!");
        
        // while(sc.hasNextLine()){
        //     String login=sc.nextLine();
        //     String password=sc.nextLine();
        //     hm.put(login, password);
        // }
        // // Iterator it = hm.iterator;
        // System.out.println("HashMap contents: " + hm);
        sc.close();
    }
}
