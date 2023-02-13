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

        Random random = new Random();
        int res;
        while(true){
        int num= scanner.nextInt();
        if (num == 0) {
            break;
        } else 
        if(num>12 || num<2) {
        System.out.println("error"); 
        continue;
    }
        int kubik1=random.nextInt(6);
        int kubik2=random.nextInt(6);    
        res=kubik1+kubik2;
        if(res==num) System.out.println("you won");
        else System.out.println(res + " LOOSER");
    
        
    }

    }
}