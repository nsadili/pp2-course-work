package Week05.Exercises;

public class MathDemo {
    public  int min(int a, int b) {
         int min;
        if (a < b) {
           min=a;
        } else {
            min=b;
        }
        return min;
    }

    public  int max(int a, int b) {
        int max;
        if (a < b) {
            max=b;
        } else {
           max=a;
        }
        return max;
    }
    public int sum(int[] args){
        int sum=0;
        for (int i = 0; i < args.length ; i++) {
            sum+=args[i];
        }

        return sum;
    }
    public float mean(int[] args){
        return this.sum(args)/ args.length;
    }
    public int factorial(int n){
        int fact=1;
        for (int i = 1; i <= n; i++) {
           fact*=i;
        }
        return  fact;
    }

    public static void main(String[] args) {
        MathDemo math = new MathDemo();
        math.min(5, 4);
        math.max(5, 4);
        int[]numbers={10,20,30};
        System.out.println(math.sum(numbers));
        System.out.println(math.mean(numbers));
        System.out.println(math.factorial(5));
    }
    //When defining these methods as static, we do need create a object to envoke these methods.
}



