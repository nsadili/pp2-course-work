import java.util.Scanner;

public class ExplodedString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        int x=0;
        for(int i=0;i<word.length(); i++ ){
            for(int j=0; j<=x;j++){
                System.out.printf("%s",word.charAt(j));
            }
            x++;
        }
    }
}
