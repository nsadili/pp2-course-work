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

        int monthNum = scanner.nextInt();
        String monthName;
        int numDays;
        switch (monthNum) {
            case 1:
                monthName = "January";
                numDays = 31;
                break;
            case 2:
                monthName = "February";
                numDays = 28;
                break;
            case 3:
                monthName = "March";
                numDays = 31;
                break;
            case 4:
                monthName = "April";
                numDays = 30;
                break;
            case 5:
                monthName = "May";
                numDays = 31;
                break;
            case 6:
                monthName = "June";
                numDays = 30;
                break;
            case 7:
                monthName = "July";
                numDays = 31;
                break;
            case 8:
                monthName = "August";
                numDays = 31;
                break;
            case 9:
                monthName = "September";
                numDays = 30;
                break;
            case 10:
                monthName = "October";
                numDays = 31;
                break;
            case 11:
                monthName = "November";
                numDays = 30;
                break;
            case 12:
                monthName = "December";
                numDays = 31;
                break;
            default:
                monthName = "no month";
                numDays = 0;
                break;
        }
        System.out.println(monthName +" " +numDays);



    }
}