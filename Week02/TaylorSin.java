class TaylorSin {
    public static void main(String[] args) {
        int n = 35;
        double sin = 0.0;
        int x = 50;
        for (int i = 0; i < n; i++) {
            int fact = 1;
            for (int j = 1; j <= (2 * i + 1); j++) {
                fact *= j;
            }
            sin += (Math.pow(-1, i) * Math.pow(x, (2 * i + 1))) / fact;
        }
        System.out.println(sin);
       
    }
}
