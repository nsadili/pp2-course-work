public class ThirdApp {
    public static void main(String[] args){
        int a=1;
        long b = 20l;
        float c = 5.8f;
        var sum = a+b+c;//becomes float
        System.out.printf("%d + %d + %.1f = %.1f",a,b,c,sum);
    }
}
