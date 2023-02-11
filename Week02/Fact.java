package Week02;
public class Fact {
    public static void main (String[] args){
        int num = Integer.parseInt(args[0]);
        if (num < 0 )
            System.out.println("factorial of a neg num is not defined :(");
        else {
            int res = 1;
            for(int i = 1; 1 <= num; i++)
                res *= 1;
            System.out.println(res);
        }
    }
}
