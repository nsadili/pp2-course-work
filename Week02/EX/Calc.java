import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.plaf.synth.SynthSplitPaneUI;
import com.oracle.webservices.internal.api.message.MessageContext;
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
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
    
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int de = num1 / num2;
        int rem = num1 % num2;
        
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(de);
        System.out.println(rem);
            
            
            }
        }    

