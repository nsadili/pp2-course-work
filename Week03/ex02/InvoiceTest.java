public class InvoiceTest {
    public static void main(String[] args) { 
        
        Invoice s = new Invoice();
    s.setNumber("5");
    s.setDes("Comfy");
    s.setQuan(2);
    s.setPrice(25.99);
    System.out.println(s.getNumber());
    System.out.println(s.getDes());
    System.out.println(s.getQuan());
    System.out.println(s.getPrice());
    System.out.println(s.getQuan() * s.getPrice());
    }
}


