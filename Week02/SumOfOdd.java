public class SumOfOdd {
    public static void main(String[] args){
        var a=Integer.parseInt(args[0]);
        var b=Integer.parseInt(args[1]);
        System.out.printf("%d",(a%2)*a+(b%2)*b);
    }
}
