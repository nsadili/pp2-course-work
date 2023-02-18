    import java.util.Scanner;
    import week04.arrayOfInvoices.Invoices;
    public  class  InvoicesTest {
        public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of invoices that is required to consider: ");
        int n= sc.nextInt();
        double a []= new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Quantity is: ");
            int q = sc.nextInt();
            //q= quantity
            System.out.println("Price is: ");
            double p =sc.nextDouble();
            //p=price
            a[i]= new Invoices(q,p).getInvoiceAmount();
            // creating each object which can calculate invoice amount

        }
        for(int i=0; i<a.length;i++){
            System.out.printf("%d) invoice amount is : %5f\n",i+1,a[i]);
        }







       
    
}
    }
