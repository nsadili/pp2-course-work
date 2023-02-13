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
        int totalSeconds = scanner.nextInt();
        
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        System.out.println(hours + " : " + minutes + " : " + seconds);
    
            
            }
        }    

