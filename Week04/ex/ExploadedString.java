import java.util.Scanner;

public class ExploadedString {
    public static void main(String[] args) {
        String s;
        System.out.println("Please enter the string: ");
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        System.out.println(ExploadedString(s));

    }

    private static String ExploadedString(String s){

        StringBuilder expString=new StringBuilder();

        for(var i=1;i<=s.length();i++){
            for(var j=0;j<i;j++){
                expString.append(s.charAt(j));
            }
        }

        return expString.toString();


    }
}
