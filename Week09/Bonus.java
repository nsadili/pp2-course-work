import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) throws FileNotFoundException {
        long time1=System.currentTimeMillis();
        LinkedList<Integer> ll = new LinkedList<>();
    
        int n=0;
        File filee = new File("Integers.txt");
        // try {
            Scanner sc = new Scanner(filee);
            // Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int index=0;
                n=sc.nextInt();
    
                if(ll.isEmpty()) ll.add(n);
    
                else if (n<ll.getFirst()) ll.addFirst(n);
                else if (n>ll.getLast()) ll.addLast(n);
    
                else {
                    for (int x : ll){
                        if (n>=x) index++;
                        else {
                            ll.add(index, n);
                            break;
                        }
                    }
                }
            }
            sc.close();
    
            System.out.println(ll);
            System.out.println("the time spent for operation: "+(System.currentTimeMillis()-time1)); //it gave 11-12
            // System.out.println("Done");
        // }catch (FileNotFoundException e){
            // System.out.println("File not found!");
        // }

        
    }
}
