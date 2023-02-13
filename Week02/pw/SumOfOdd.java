//package Week02.pw;

public class SumOfOdd {
    public static void main(String args[]){
        int num1 = Integer.valueOf(args[0]);
        int num2 = Integer.valueOf(args[1]);
        int a = (num1 > num2) ? num2 : num1;
        int b = (num1 > num2) ? num1 : num2;
        int sum = 0;
        for(int i = a+1; i < b; i++){
            if(i%2 == 1){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    
}
