public class MathDemo {
    
    static int res;
    static int sum = 0;
    static int cnt = 0;
    
    public static int Min(int a, int b) {

    return a < b ? a : b;

    }

     public static int Max(int a, int b) {

    return a > b ? a : b;

    }

    public static int Sum(int[] args) {

        String str1 = new String();
        var sum1 = 0;
        int numbers1 = Integer.parseInt(str1);
        if (str1.isEmpty())
        return 0;
        else
        {
            sum1 += numbers1;
        }
        return numbers1;
    }

    public static float mean(int[] args) {
        String str = new String();
        if (str.isEmpty())
        return 0;
        else
        {
          int numbers = Integer.parseInt(str);
          sum += numbers;
            cnt++;
        }
        return sum / cnt;
    }

    public static int factorial(int n) {
        
        while (n == 1) {
        res = n * (n - 1);
        n--;
        }

        return res;
    }
}