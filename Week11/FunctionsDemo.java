package Week11;

import java.net.Socket;
import java.util.Random;
import java.util.function.Supplier;

public class FunctionsDemo {
    
   // System.out.println(isAnagram.test(abcd));
     Random randomGenerator= new Random();
     
    Supplier<Integer> rand =()-> new Random ().nextInt() +1;
    
    double avg = 0;

    for(int i =0; i<1000; i++)
    avg+= rand.get();
    avg = avg/ 1000;
    System.out.println(avg);
}

}
