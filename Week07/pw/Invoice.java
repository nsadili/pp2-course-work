public class Invoice {
    private String number;
    private String dest;
    private int quantity;
    private double price;

    public Invoice(String number, String dest, int quantity, double price) throws IllegalArgumentException{
        this.number=number;
        this.dest=dest;
        if (quantity<0){
            throw new IllegalArgumentException("Negative quantity!!!");
        }
        this.quantity=quantity;
        if (price<0.0){
            throw new IllegalArgumentException("Negative price!!!");
        }
        this.price=price;
    }
    public double getInvoiceAmount(){
        return this.quantity*this.price;
    }

    public String getNumber(){
        return this.number;
    }
    public String getDest()
    {
        return this.dest;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getPrice(){
        return this.price;
    }

    public void setNumber(String number){
        this.number=number;
    }
    public void setDest(String dest){
        this.dest=dest;
    }
    public void setQuantity(int quantity){
        if (quantity<0){
            throw new IllegalArgumentException("Negative quantity!!!");
        }
        this.quantity=quantity;
    }
    public void setPrice(double price){
        if (price<0.0){
            throw new IllegalArgumentException("Negative price!!!");
        }
        this.price=price;
    }
    

    public static void main(String[] args){
        try{
        Invoice I1 = new Invoice("FOUR", "Good Keyboard", 16, 80);
        System.out.printf("A part number is %s\n", I1.getNumber());
        System.out.printf("Description: %s\n", I1.getDest());
        System.out.printf("QUANTITY: %d\n", I1.getQuantity());
        System.out.printf("PRICE: %.3f$\n", I1.getPrice());
        System.out.printf("AMOUNT: %.3f$\n", I1.getInvoiceAmount());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        // System.out.printf("A part number is %s\n", I1.getNumber());
        // System.out.printf("Description: %s\n", I1.getDest());
        // System.out.printf("QUANTITY: %d\n", I1.getQuantity());
        // System.out.printf("PRICE: %.3f$\n", I1.getPrice());
        // System.out.printf("AMOUNT: %.3f$\n", I1.getInvoiceAmount());
    }
}


