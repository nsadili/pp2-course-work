public class Factorial {
    public static int factorial(int n) throws IllegalArgumentException {
        if(n<0){
            IllegalArgumentException e = new IllegalArgumentException("The number is negative");
            throw e;
        }
        if(n==0) return 1;
        else{
            return n*factorial(n-1);
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println(factorial(10));
    }
}
