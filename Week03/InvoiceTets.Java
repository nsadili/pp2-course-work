ublic class InvoiceTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1234", "Hammer", 2, 14.99);

        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Part description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());

        invoice.setQuantity(3);
        invoice.setPricePerItem(15.99);

        System.out.println("Updated quantity: " + invoice.getQuantity());
        System.out.println("Updated price per item: " + invoice.getPricePerItem());
        System.out.println("Updated invoice amount: " + invoice.getInvoiceAmount());
    }
}