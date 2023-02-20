import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String sub = scan.nextLine();
        System.out.println(string + " " + sub);
        int indx = string.indexOf(sub);
        if(indx == string.indexOf(sub) ){
            System.out.println(indx);
        }else{
            System.out.println("-1");
        }
        
    }
}
