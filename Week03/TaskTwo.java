//INVOICE CLASS: 
package pp2.week03.ex02;

public class Invoice {
    private String partNum;
    private String partDes;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNum, String partDes, int quantity, double pricePerItem) {
        this.partNum = partNum;
        this.partDes = partDes;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNum() {
        return this.partNum;
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public String getPartDes() {
        return this.partDes;
    }

    public void setPartDes(String partDes) {
        this.partDes = partDes;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }

    }

    public double getPricePerItem() {
        return this.pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (this.pricePerItem < 0.0) {
            this.pricePerItem = 0.0;
        } else {
            this.pricePerItem = pricePerItem;
        }

    }

    public double getInvoiceAmount(int x) {
        return (double)x * this.pricePerItem;
    }

    public void showInformation() {
        System.out.println("The part number is " + this.partNum);
        System.out.println("The description :  " + this.partDes);
        System.out.println("The quantity is: " + this.quantity);
        System.out.println("The price per Item is " + this.pricePerItem);
    }
}


// INVOICE TEST:

package pp2.week03.ex02;
import java.util.Scanner;
    public class  InvoiceTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the number of items : ");
        int x = scan.nextInt();
        Invoice car = new Invoice("1234", "This is a car", 120, 1200);
        car.showInformation();
        double m = car.getInvoiceAmount(x);
        System.out.println("The totoal amount is : " + m);
    }
}





