import java.util.ArrayList;
import java.util.Collections;
public class MainAccount {
    public static void main(String[] args) {
        ArrayList<ListOfAccounts> accounts = new ArrayList<>();
accounts.add(new ListOfAccounts("Roya", "Alizada", 200));
accounts.add(new ListOfAccounts("Nihad", "Ali", 500));
accounts.add( new ListOfAccounts("Gunay", "Jafarli", 1200));


  for (ListOfAccounts account : accounts) {
   System.out.println(account.toString());
  }
  Collections.sort(accounts);
  for (ListOfAccounts account : accounts) 
  System.out.println(accounts);
    }
}

