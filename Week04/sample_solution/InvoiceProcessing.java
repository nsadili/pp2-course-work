import java.util.Scanner;

class Invoice {
    String partName;
    Integer quantity;
    Double pricePerItem;

    // Default constructor
    // public Invoice(/* no input parameters */) {
    // System.out.println("Here in the default constructor");
    // }

    public Invoice(String partName, int quantity, double pricePerItem) {
        // this keyword is to represent the current object we are in
        this.partName = partName;
        this.quantity = (quantity < 0 ? 0 : quantity); // ternary conditional operator
        this.pricePerItem = (pricePerItem < 0 ? 0 : pricePerItem);
    }

    // getter - accessor methods
    public String getPartName() {
        return this.partName;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public Double getPricePerItem() {
        return this.pricePerItem;
    }

    // setter - modifier methods
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public Double getInvoiceAmount() {
        return this.quantity * this.pricePerItem;
    }

    public String toString() {
        return "[name: " + partName + ", quantity: " + quantity + ", price: " + pricePerItem + "]";
    }
}

public class InvoiceProcessing {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        Invoice[] invoices = new Invoice[size];

        String name;
        int quantity;
        double price;

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the info of invoice %d:\n", i + 1);
            System.out.print("name > ");
            name = scan.next();

            System.out.print("quantity > ");
            quantity = scan.nextInt();

            System.out.print("price > ");
            price = scan.nextDouble();

            invoices[i] = new Invoice(name, quantity, price);
        }

        for (Invoice in : invoices) {
            System.out.println(in + " -->>> total invoice amount: " + in.getInvoiceAmount());
        }

        scan.close();

    }

}
