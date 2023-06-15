import java.util.ArrayList;
import java.util.List;
import java.util.Random;  // liblary for random generator 
public class RollingDie {
    // i m not sure about this question ._.     :'(
    public static class Letters {
 
        private int letter;
        private int count;
        private double probability;
    
        public Letters(int letter, int count, double probability) {
            this.letter = letter;
            this.count = count;
            this.probability = probability;
        }
public static void main(String [] args)
{
    List<Letters> letters = new ArrayList<>();

       
        letters.add(new Letters(1, 0, 0.125));
        letters.add(new Letters(2, 0, 0.125));
        letters.add(new Letters(3, 0, 0.125));
        letters.add(new Letters(4, 0, 0.125));
        letters.add(new Letters(5, 0, 0.25));
        letters.add(new Letters(6, 0, 0.25));
        letters.add(new Letters(7, 0, 0.0));
        letters.add(new Letters(0, 0, 0.0));


     Random r = new Random(); // random generator 
     int result = r.nextInt(7); // result from  to 5
     
     System.out.println(result);



}    


}



}
