import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Exercise
{
    public static void main(String[] args)
    {
        Program program = new Program();

        program.getInput();
        System.out.println();

        System.out.println(program.toString());

        // Get max
        System.out.println(program.getMax());

        // Get max
        System.out.println(program.getMin());
    }
}

class Program
{
    private String inputData = "";
    private Scanner scan = new Scanner(System.in);

    public void getInput()
    {
        inputData = scan.nextLine();
    }

    public int getMax()
    {
        int max = Integer.parseInt(inputData.split(" ")[0]);

        for (int i = 0; i < inputData.split(" ").length; i++)
            if (Integer.parseInt(inputData.split(" ")[i]) > max)
                max = Integer.parseInt(inputData.split(" ")[i]);

        return max;
    }

    public int getMin()
    {
        int min = Integer.parseInt(inputData.split(" ")[0]);

        for (int i = 0; i < inputData.split(" ").length; i++)
            if (Integer.parseInt(inputData.split(" ")[i]) < min)
                min = Integer.parseInt(inputData.split(" ")[i]);

        return min;
    }

    public String toString()
    {
        StringBuilder strToReturn = new StringBuilder();

        strToReturn.append("Fields: \n");
        for (Field field: Program.class.getDeclaredFields())
        {
            strToReturn.append("\t" + field.getName() + ": " + field.getType() + "\n");
        }

        strToReturn.append("\nMethods: \n");
        for (Method method: Program.class.getDeclaredMethods())
        {
            strToReturn.append("\t" + method.getName() + ": " + method.getGenericReturnType() + "\n");
        }

        return strToReturn.toString();
    }
}