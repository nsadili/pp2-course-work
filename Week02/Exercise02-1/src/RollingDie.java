import java.lang.Math;

public class RollingDie {
    public static void main(String[] args) {
        double x  = Math.random();

        while (x >= 0.8)
            x = Math.random();
        
        if (x < 0.1) System.out.println("1");
        else if (x < 0.2) System.out.println("2");
        else if (x < 0.3) System.out.println("3");
        else if (x < 0.4) System.out.println("4");
        else if (x < 0.6) System.out.println("5");
        else if (x < 0.8) System.out.println("6");
    }
}
