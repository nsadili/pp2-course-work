package Week08.EX;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

public class EX3 {
    public static void main(String[] args) {
        List<Account2> accList = new ArrayList<>(
            List.of(
                new Account2("Big" , "Mama" , 300),
                new Account2("Small" , "Daddy" , 3000),
                new Account2("Bad" , "Mama" , 200)

            )
        );

        Collections.sort(accList);

        printList(accList);

        
    }
    
}
