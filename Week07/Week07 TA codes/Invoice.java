import java.util.Scanner;

public class Invoice {
    private double price;

    public Invoice(double price) {
        if(price < 0) {
            throw new IllegalArgumentException("price cannot be negative");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a price value for the new Invoice object: ");
        try {
            double price = scanner.nextDouble();
            Invoice invoice = new Invoice(price);
            System.out.println("New object is ready.");
        } catch (Exception e) {
            System.out.println("The value is not valid. Try again.");
        }
    }
}
