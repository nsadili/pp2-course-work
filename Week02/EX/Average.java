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

        double sum = 0;
        int count = 0;
        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
            count++;
        }
        if (count == 0) {
            System.out.println("No input entered");
        } else {
            double average = sum / count;
            System.out.println(average);
        }

    }
}