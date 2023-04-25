public class Loop {
    public static void main(String[] args) {
        long[] sum = new long[4];              // 0; 1; 2; 3;

        long before = System.currentTimeMillis();
        for(int i = 1; i <= 4; i++) 
            for (int j = 0; j < 1000000; j++) {
                sum[i - 1] += i * j + Math.pow(i,3);
            
        }
        long after = System.currentTimeMillis();

       System.out.println(sum[3]);
       System.out.println(after - before);
    }
}
