import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.plaf.synth.SynthSplitPaneUI;
import com.oracle.webservices.internal.api.message.MessageContext;

import java.io.FilterInputStream;
import java.util.*;
import javax.print.attribute.standard.JobMessageFromOperator;
import javax.print.event.PrintJobListener;
import javax.swing.JOptionPane;
public class App {
    /**
     * @param args
     * @throws Exception
     */
     public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
       
        double n, min = Double.POSITIVE_INFINITY, max=Double.NEGATIVE_INFINITY;
        while(scanner.hasNextDouble()){
            n=scanner.nextDouble();
            if(n<min) min=n;
            if(n>max) max=n;

        }
        System.out.println(min);
        System.out.println(max);
    }
}