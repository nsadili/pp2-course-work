package Java_Codes_Nargiz;

public class StringTest {
    

    public static void main (String args[]){

        String test = "Programming";

        System.out.println("String length: "+test.length());
        System.out.println("Equals 1: " + test.equals("programming"));
        System.out.println("Equals 2: " + test.equals("Programming"));
        System.out.println("The 5th character: " + test.charAt(5));
        System.out.println("Compare to: " + test.compareTo("principle"));
        System.out.println("Index of gram: " + test.indexOf("gram"));
        System.out.println("Substring: " + test.substring(3,5));

    }
}
