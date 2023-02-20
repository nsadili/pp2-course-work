import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {

String s = "listen";
String s1 = "silent";

System.out.println(checkIfAnagram(s1, s));
        
    }

    public static boolean checkIfAnagram(String s1, String s2){
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        String s3 = new String(s1Arr);
        String s4 = new String(s2Arr);

        return s3.equals(s4);

    }
}
    

