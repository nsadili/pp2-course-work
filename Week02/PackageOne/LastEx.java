package PackageOne;

public class LastEx {
   public static void main(String[] args){
    int x;
    x = 86;

    System.out.println("Deccimal:" + x);
    System.out.println("Hexadecimal: " + Integer.toHexString(x));
    System.out.println("Octal: " + Integer.toOctalString(x));
    System.out.println("Binary: " + Integer.toBinaryString(x));

    float y = 3.14f;

    System.out.println("Deccimal:" + y);
    System.out.println("Hexadecimal: " + Float.toHexString(y));
    System.out.println("Scientific: " + String.format("%e", y));
   } 
}
