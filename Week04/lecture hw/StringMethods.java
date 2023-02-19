

public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("Welcome");
        String s2 = new String("Azerbaijan");
        System.out.println(s1.length());
        System.out.println(s1.equals("welcome"));
        System.out.println(s1.equals("Azerbaijan"));

        System.out.println(s1.charAt(3));
        System.out.println(s1.compareTo("hello world"));
        System.out.println(s2.substring(2,8));
        System.out.println(s1.concat(s2));
        System.out.println(s1.intern());

    }
    
}
