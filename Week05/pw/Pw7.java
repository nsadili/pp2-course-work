package Week05.pw;

public class Pw7 {
    public class MathDemo {

        public int min(int a, int b) {
            return Math.min(a, b);
        }
    
        public int max(int a, int b) {
            return Math.max(a, b);
        }
    
        public int sum(int[] args) {
            int sum = 0;
            for (int i : args) {
                sum += i;
            }
            return sum;
        }
    
        public float mean(int[] args) {
            if (args.length == 0) {
                return 0;
            }
            int sum = sum(args);
            return (float) sum / args.length;
        }

        public int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n-1);
            }
        }
    }
}


// What would be the advantage of defining these methods as static?
// We can call them directly on the class, without the need to create an object of the MathDemo class.