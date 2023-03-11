public class ParseNumbers {
    public static void main(String[] args) {
        String n1 = "145687";
        String n2 = "986da4s56";
        String n3 = "8674";

        try {
            System.out.println(parse(n1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(parse(n2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(parse(n3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int parse(String str) {
        int c = 1;
        int num = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                num += Character.getNumericValue(str.charAt(i)) * c;
                c *= 10;
            }
            else throw new IllegalArgumentException("Not a number.");
        }
        
        return num;
    }
}