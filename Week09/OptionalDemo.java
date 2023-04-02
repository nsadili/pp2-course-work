import java.util.Scanner;
import java.util.StringTokenizer;

public class OptionalDemo {
    public static void main(String[] args) {
        String text = "Hello. I am Rufat rufat Hajizada, first year Computer Engineering student at ADA University.";

        Scanner sc = new Scanner(System.in);
        System.out.println(findTheWord(text, sc.next()));
        sc.close();

        
    }
    public static String findTheWord (String text, String str){
        StringTokenizer st = new StringTokenizer(text, " .,!?/:;-'_+=*");
        while (st.hasMoreTokens()){
            String word = st.nextToken();
            if (word.toLowerCase().contains(str.toLowerCase())) {
                return word;
            }
        }
        System.out.println("No result found.");
        return null;
    }
}
