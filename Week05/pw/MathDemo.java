package Week05.pw;

import javax.sound.sampled.SourceDataLine;

public class MathDemo {
    
    static int res;
    static int sum = 0;
    static int counter = 0;
    
    public static int Min(int a, int b) {

    return a < b ? a : b;

    }

     public static int Max(int a, int b) {

    return a > b ? a : b;

    }

    public static int Sum(int[] args) {

        String str1 = new String();
        var summ = 0;
        int numbers1 = Integer.parseInt(str1);
        if (str1.isEmpty())
        return 0;
        else
        {
            summ += numbers1;
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
            counter++;
        }
        return sum / counter;
    }

    public static int factorial(int n) {
        
        while (n == 1) {
        res = n * (n - 1);
        n--;
        }

        return res;
    }
    
}