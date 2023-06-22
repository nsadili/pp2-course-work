public class MathDemo {
    public int min(int a, int b) {
        return Math.min(a, b);
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    public float mean(int[] args) {
        if (args.length == 0) {
            return 0;
        }
        int total = sum(args);
        return (float) total / args.length;
    }

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
/*
Advantages of static methods: 
 No objects
 Easier access
 Clean code (organized)
 Less memory used
*/ 