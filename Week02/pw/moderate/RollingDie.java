public class RollingDie {
    public static void main(String[] args) {
        double roll = Math.random();
        int res;
        if (roll < 0.125) res = 1;
        else if (roll < 0.25) res = 2;
        else if (roll < 0.375) res = 3;
        else if (roll < 0.5) res = 4;
        else if (roll < 0.75) res = 5;
        else res = 6;
        System.out.println(res);
    }
}
