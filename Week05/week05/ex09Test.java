package pp2.week05;

public class ex09Test
{
        public static void main(String[] args)
        {
            Customer c = new Customer(13629, "Ayla Ibrahimova", 'f', 50);
            System.out.println(c.toString());

            Account account1 = new Account(13628, c);
            System.out.println(account1.toString());

            Account account2 = account1.deposit(888.00);
            System.out.println(account2.toString());
            account2.withdraw(999.00);

        }
}
