public class RollingDie {
    public static void main(String[] args) {
        double random = Math.random();

        var a=0;
        if (random<1.0/8) a=1; else
        if (random<2.0/8) a=2; else
        if (random<3.0/8) a=3; else
        if (random<4.0/8) a=4; else
        if (random<6.0/8) a=5; else a=6;

        System.out.println(a);

    }
}
