public class PrintingPatterns {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        
        for(int i = 1; i <= Math.pow(n, 2); i++){
            System.out.print((i % 2 == 1) ? "*" : "#");
            System.out.print((i % n == 0) ? "\n" : "");
        }
    }
}
