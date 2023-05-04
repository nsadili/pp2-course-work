public class SumExpression {
    public static void main(String[] args) {
        int result = 1 * 5 / 2 * 3 - 3 / 10;
        System.out.println("Result using println(): " + result);

        System.out.print("Result using print(): ");
        System.out.print(result);

        System.out.printf("\nResult using printf(): %d", result);
    }
}
