public class Main {
    public class Main {
        public static void main(String[] args) {
            try {
                Invoice invoice = new Invoice("Item description", 5, -10.0);
            } catch (IllegalArgumentException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
    
}
