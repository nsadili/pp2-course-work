package Easy;
public class Fact {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[1]);
        long factorial = 1;

        if (number < 0){
            System.out.println("Error: Number is not valid.");
        }
        else {
            for (int i = 1; i <= number; i++){
                factorial *= i;
            }
        }
        
        System.out.println(factorial);
      }
}
