package Week10;

import Week03.geometry.Point;

public class PracticingGenericMethods {
    public static void main(String[] args) {
        int[] numbers = new int[]{34, 49, 90, 0};
        double [] doubleNumbers = new double[]{12.2, 45.5, 57.7};
        String[] studentsName = new String[]{"Shamil", "Ali", "Suelka"};
        Point[] coordinates = new Point[]{};

        printer(doubleNumbers);


    }

    public static <T> void printer(T[] doubleNumbers) {
        for (T x : doubleNumbers) {
            System.out.println(x);
            
        }
    }

}
