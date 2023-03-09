import java.util.Scanner;

public class Invoice {
    String partNumber;
    String partDescription;
    Integer quantityOfItem;
    Double priceOfItem;

    public Invoice(){};
    public Invoice (String partNumber, String partDiscription, int quantityOfItem, Double priceOfItem){
        this.setNumber(partNumber);
        this.setDescription(partDiscription);
        this.setQuantity(quantityOfItem);
        this.setPrice(priceOfItem);
    }
    public void setNumber (String n){
        for (int i = 0; i < n.length(); i++){
            if (!(n.charAt(i) == ' ' || (n.charAt(i) >= 65 && n.charAt(i) <= 90) || (n.charAt(i) >= 97 && n.charAt(i) <= 122) || n.charAt(i) == '\n')) {
                throw new IllegalStringException(); 
            }
        }
        this.partNumber = n;
    }
    public void setDescription (String n){
        for (int i = 0; i < n.length(); i++){
            if (!(n.charAt(i) == ' ' || (n.charAt(i) >= 65 && n.charAt(i) <= 90) || (n.charAt(i) >= 97 && n.charAt(i) <= 122) || n.charAt(i) == '\n')) throw new IllegalStringException(); 
        }
        this.partDescription = n;
    }
    public void setQuantity (int n){
        this.quantityOfItem = n;
        if (quantityOfItem < 0) throw new IllegalArgumentException();
    }
    public void setPrice (double n){
        this.priceOfItem = n;
        if (priceOfItem < 0) throw new IllegalArgumentException();
    }
    public String getNumber(){
        return this.partNumber;
    }
    public String getDescription(){
        return this.partDescription;
    }
    public int getQuantity(){
        return this.quantityOfItem;
    }
    public double getPrice(){
        return this.priceOfItem;
    }
    public double getInvoiceAmount(){
        return quantityOfItem * priceOfItem;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Invoice product = new Invoice();

        do {
            try {
                System.out.print("Print the part number name: ");
                product.setNumber(scan.nextLine());
                System.out.print("Print the part description: ");
                product.setDescription(scan.nextLine());
                System.out.print("Print the quantity of the item: ");
                product.setQuantity(scan.nextInt());
                System.out.print("Print the price of the item: ");
                product.setPrice(scan.nextDouble());
                System.out.printf("Part number: %s\tPart Description: %s\nQuantity: %d\tPrice: %.2f\n\n", 
                product.getNumber(), product.getDescription(), product.getQuantity(), product.getPrice());
                
                scan.close();
            } catch (IllegalStringException e){
                System.out.println("The input must be a word!");
                e.printStackTrace();
            } catch (IllegalArgumentException e){
                System.out.println("The input cannot be negative!");
                e.printStackTrace();
            }
        }
        while (true);
    }
}
