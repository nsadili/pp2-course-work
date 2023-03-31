import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Bonus2 {
    public static void main(String[] args) throws FileNotFoundException {
        long time1=System.currentTimeMillis();
        LinkedList<Integer> ll = new LinkedList<>();
    
        int n=0;
        int temp=0;
        File filee = new File("Integers.txt");
        Scanner sc = new Scanner(filee);
        while(sc.hasNext()){
            int index=0;
            ll.add(sc.nextInt());
        }

        System.out.println(ll);

        for (int i=0; i<ll.size(); i++){
            for (int j=i+1; j<ll.size(); j++){
                if (ll.get(j)<ll.get(i)){
                    temp=ll.get(i);
                    ll.set(i, ll.get(j));
                    ll.set(j, temp);
                }
            }
        }
        sc.close();

        System.out.println(ll);
        System.out.println("the time spent for operation: "+(System.currentTimeMillis()-time1)); //it gives 11-12

            // System.out.println("Done");
        // }catch (FileNotFoundException e){
            // System.out.println("File not found!");
        // }
    }

}
