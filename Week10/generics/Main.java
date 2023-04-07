package generics;

public class Main {
    public static void main(String[] args) {
        GenericNumeric<Float> n = new GenericNumeric<>(5f);
        GenericNumeric<Integer> b = new GenericNumeric(5);
        System.out.println(n.getA());
        System.out.println(n.fractional());
        try{
            System.out.println(n.reciprocal());

        }catch(Exception e){
            System.out.println("Cannot be divided into 0");
        }
        System.out.println( n.cmpAbsolute(5));
        System.out.println(n.cmpAbsolute(b));
    }
}
