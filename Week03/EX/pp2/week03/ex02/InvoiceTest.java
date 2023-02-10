package pp2.week03.ex02;

public class InvoiceTest {
    public static void main(String[] args){
    Invoice p = new Invoice("five","new items",10,2.5);
    p.setDesc("Buy our products!");

System.out.printf("Number: %s\n,Description: %s\nQuantity: %d\nPrice: %.2f\n",p.getNumber(),p.getDesc(),p.getQuantity(),p.getPrice());
System.out.printf("Invoice amount: %f",p.getInvoiceAmount());

    }
}
