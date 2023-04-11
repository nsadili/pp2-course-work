import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

public class DistinctWords {

    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>(
                Arrays.asList("Emil", "Mike", "Lime", "Cassy","Mike", "Coul","Emil"));
        for(int i=0;i<list.size();i++){
            int cnt=0;
            for (String s: list) {
                if(Objects.equals(list.get(i), s)) {
                    cnt++;
                }
                if(cnt>=2){
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}

