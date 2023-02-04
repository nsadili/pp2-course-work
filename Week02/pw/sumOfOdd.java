import java.util.Scanner;
public class sumOfOdd {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int firstNum = obj.nextInt();
        int secondNum = obj.nextInt();
        int sum = 0;
        if(firstNum > secondNum){
            for(;firstNum>secondNum;firstNum--){
                if(firstNum%2==1)
                sum+=firstNum;
            }
        }else if(firstNum < secondNum){
            for(;secondNum>firstNum;secondNum--){
                if(secondNum%2==1)
                sum+=secondNum;
            }
        }
        System.out.println("sum of odds is:"+sum);
    }
}
