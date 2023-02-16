public class MathPackage {
    public static void main(String[] args){
        int x = 100;
        int y = 2;

        int absolute = Math.abs(x);
        int maximum = Math.max(x, y);
        double power = Math.pow(x, y);
        double squaredX = Math.sqrt(x);
        double squaredY = Math.sqrt(y);
 
        System.out.println(absolute); 
        System.out.println(maximum);
        System.out.println(power);
        System.out.println(squaredX);
        System.out.println(squaredY);
    }
}
