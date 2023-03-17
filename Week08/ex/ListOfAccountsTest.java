package Week08.ex;

import java.util.ArrayList;

public class ListOfAccountsTest {
    public static void main(String[] args){
        ArrayList <ListOfAccounts> accounts = new ArrayList<>();

        accounts.add(new ListOfAccounts("Naik", "Pashayev", 888.88));
        accounts.add(new ListOfAccounts("Vidadi", "Nabiyev", 1000.00));
        accounts.add(new ListOfAccounts("Turkana", "Aliyeva", 2500.00));

        System.out.println(accounts);
    }
}
