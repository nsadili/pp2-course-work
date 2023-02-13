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

        int number = 0;
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Error");
                } else {
                    int result = 1;
                    for (int i = 1; i <= number; i++) {
                        result *= i;
                    }
                    System.out.println(result);
                }

    }
}