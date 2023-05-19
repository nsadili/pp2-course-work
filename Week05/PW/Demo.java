package Week05.PW;

public class Demo {
  
        public static int min(int a, int b){
            return a < b ? a : b;

        }
        public static int max(int a, int b){
            return a > b ? a : b;

        }
        public static int sum(int[] args){
            int res=0;
            for (int i = 0; i < args.length; i++) {
                res += args[i];
            }
            return res;
    
        }
        public static float mean(int[] args) {
          
            int sum = sum(args);
            return (float) sum / args.length;
        }
        public static int factorial(int n) {
            
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }