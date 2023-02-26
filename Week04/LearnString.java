import java.lang.String;
public class LearnString {
    public static void main(String[] args){
        //Easy way
        String str1 = "Hello all";
        String str2 = str1;

        //With String constructor 
        String str3 = new String("Hello all");

        // Copy of another string (not reference to it!)
        String str4 = new String(str1);

        System.out.println(str1 + " / " + str2 + " / " + str3 + " / " + str4);
    }
}
