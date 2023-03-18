package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainOfListOfAaccounts {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) { 
		List<ListOfAccounts> accountList = new ArrayList<>();

		accountList.add(new ListOfAccounts("Huseyn", "Sadatkhanov", 6000.0));
		accountList.add(new ListOfAccounts("Ali", "Nasirli", 5000.0));
		accountList.add(new ListOfAccounts("Zakir", "Ashirli", 4000.0));

		Collections.sort(accountList);
		System.out.println("Sorted by fullname:");
		
		for (ListOfAccounts account : accountList) {
			System.out.println(account);
		}
		
		System.out.println("------------------------");
		
		@SuppressWarnings("rawtypes")
		Comparator balanceComparator = null;
		Collections.sort(accountList, balanceComparator);
		System.out.println("Sorted by balance:");
		for (ListOfAccounts account : accountList) {
			System.out.println(account);
		}
	}
}