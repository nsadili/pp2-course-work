public class greatandsmallb {
    public static void main(String[] args) {

        int[] elements = { 44, 6, 2, 4, 8, 21 };
        int max = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        System.out.println("Maximum element is: " + max);
    }
}
