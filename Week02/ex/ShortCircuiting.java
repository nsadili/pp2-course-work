public class ShortCircuiting {
    
    public static void main(String[] args) {

        int a = 3;
        int b = 7;
        if ((--a == 3) || (b-- == 7)) {
        System.out.println(a);
        System.out.println(b);
        }
        System.out.println(a);
        System.out.println(b);
        
        
    }
}
