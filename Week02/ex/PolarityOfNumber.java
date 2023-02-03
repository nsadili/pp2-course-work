public class PolarityOfNumber{

public static void main(String[] args) {

    double number=Double.parseDouble(args[0]);

    if(number>0){
        System.out.println("Positive");

    }else if(number<0){
        System.out.println("Negative");

    } else System.out.println("Neutral");
    
}

}