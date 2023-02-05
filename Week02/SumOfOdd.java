public class SumOfOdd {
    public static void main(String[] args){
        var a=Integer.parseInt(args[0]);
        var b=Integer.parseInt(args[1]);
        var sum= 0;
        if(a>b){
            int t=a;
            a=b;
            b=t;
        }
        for(int i=a;i<=b;i++){
            sum+=(i%2)*i;
        }
        System.out.printf("sum of odd numbers is %d",sum);
    }
}
