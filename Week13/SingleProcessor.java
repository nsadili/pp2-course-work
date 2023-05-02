import java.util.StringTokenizer;

public class SingleProcessor {
    private String text;

    public int count(){
        int count = 0;

        StringTokenizer st = new StringTokenizer(text);

        while(st.hasMoreTokens()){
            count++;
        }

        return count;
    }
}
