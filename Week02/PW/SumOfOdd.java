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

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int start, end, sum = 0;
        if (num1 < num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}