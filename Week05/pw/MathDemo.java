public class MathDemo{

      public int min(int a, int b){

        int min = 100;
        if (a < b) min = a;
        else min = b;
        return min;
      }

      public int max(int a, int b){

        int max = -100;
        if (a > b) max = a;
        else max = b;
        return max;
      }

      public int sum(int[] agrs){
        int res = 0;
        for (int i : agrs) res += i;
        return res;

      }

      public float mean(int[] args){
        return (float)sum(args) / args.length;

      }

      public int factorial(int n){

        if (n == 0) return 1;
        return n * factorial(n - 1);
      }
}
