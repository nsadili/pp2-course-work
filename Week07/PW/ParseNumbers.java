public class ParseNumbers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a series of numbers (separated by spaces):");

        int sum = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String[] tokens = line.split("\\s+");
            for (String token : tokens) {
                if (isNumeric(token)) {
                    sum += Integer.parseInt(token);
                }
            }
        }

        System.out.println("Sum of all valid input: " + sum);
    }

    private static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
}