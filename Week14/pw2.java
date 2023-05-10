import java.text.NumberFormat;
import java.util.Locale;

public class pw2 {
    public static void main(String[] args) {
        var d= 5678724.356;
        NumberFormat nf= NumberFormat.getInstance();
        System.out.println(nf.format(d));
        
        Locale l=Locale.CHINA;
        NumberFormat nf1= NumberFormat.getCurrencyInstance(l);
        System.out.println(nf1.format(d));
    }
}
