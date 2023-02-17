public class greatandsmalla {

    public static void main(String[] args) {

        int[] elements = { 44, 6, 2, 4, 8, 21 };
        int min = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
            }
        }
        System.out.println("Minimum element is: " + min);
    }
}
