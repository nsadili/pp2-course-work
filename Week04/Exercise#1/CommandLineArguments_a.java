import java.util.Scanner; //a line, which is written to provide a user an environment to type input in terminal

public class CommandLineArguments_a {
    public static void main(String[] args) {    //4th and 5th lines are created so the code allows you to print one specific input 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: "); 
        String inputString1 = scanner.nextLine();   //we use nextLine so computer will understand that it should read an input value
        System.out.println("You entered: " + inputString1);

        //from this moment we just repeat everything as we did on former lines
        System.out.print("Enter another string: ");
        String inputString2 = scanner.nextLine();
        System.out.println("You entered: " + inputString2);

        scanner.close();  //can be considerd as the "point" of the code, so all resources/information/data which was read by computer will be released
    }
}