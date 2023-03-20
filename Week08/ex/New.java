import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import list.toArray;

public class New {
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("TextFile.txt");

        Scanner scanner = new Scanner(file);

        List<String> list = new ArrayList();

        
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }

       Set<String> names = new LinkedHashSet(list);

      toArray newStr = new list.toArray();
       
      for (toArray el : newStr) {
        System.out.println(newStr);
      }

    }
}
