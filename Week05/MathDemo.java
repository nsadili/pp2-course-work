public static main void (String args[]) {
    
public class MathDemo {
    
    public int min(int a, int b) {
        return (a < b) : a ? b;
    }
    
    public int max(int a, int b) {
        return (a < b) : a ? b;
    }
    
    public int sum(int[] args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
} 