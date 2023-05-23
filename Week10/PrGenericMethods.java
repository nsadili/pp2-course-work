

public class PrGenericMethods {
    public static void main(String[] args) {

    int[] intArray;
    intArray = new int[]{5, 7, 3, 8, 13};

    double[] doubleArray;
    doubleArray = new double[]{7.4, 6.5, 9.0, 12.5};

    String[] stringArray;
    stringArray = new String[]{"Leyla", "Ulka", "Gulnar", "Mae"};
      
    Point point1 = new Point(2, 6);
    Point point2 = new Point(5, 7);
    Point[] pointArray = new Point[]{};

    stringPrinter(stringArray);

    }

    public static stringPrinter(String str) {
      for (String s :str) {
        System.out.println(s);
    }}
    
}
