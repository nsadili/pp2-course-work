public class shortcir {
    public static void main(String args[]) {
        int a = 3;
        int b = 7;
        if (( ++a == 3) && (b-- == 7)) {
        System.out.println(a); //skiped
        System.out.println(b); //skiped
        }
        System.out.println(a);//4
        System.out.println(b);//7
    }
}
