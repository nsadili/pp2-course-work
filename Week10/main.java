

public class main {

    public static void main() {

        int[] numbers = new int[] {34, 59, 100, 0, 19, 36};

        double[] doubleNumbers = new double[] {12.2, 50.1, 0.5};

        String[] studentsName = new String[]{"Nuray", "Aliya", "Ali"};

        Point[] coordinates = new Point[]{};

        printer(studentsName);
        
    }

    private static void printer(String[] studentsName) {
    }

    public static <T> void printer(T[] array, int lowerbound, int upperbound) {
        
        if (upperbound>=array.length)
        
        throw new = IllegalAccessException("");
        
        for (int i = lowerbound; i<upperbound; i++) {

            System.out.println(array[i]);

        }

    }

}