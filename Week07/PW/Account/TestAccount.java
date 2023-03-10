public class TestAccount {
    public static void main(String[] args) {
        Customer c=new Customer(12, "as", 4);

        try{
            Account a1 =new Account(2, c,344);
            a1.withdraw(345);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error: "+ e.getMessage());
            System.out.println(("In addition: "+ e.toString()));
            e.printStackTrace();
        }


    }
}
