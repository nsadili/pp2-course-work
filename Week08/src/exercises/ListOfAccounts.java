package exercises;

import java.util.Comparator;

public class ListOfAccounts implements Comparable<ListOfAccounts> {
	public class balanceComparator {

	}

	private String firstName;
	private String lastName;
	private double balance;

	public ListOfAccounts(String firstName, String lastName, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " - " + balance;
	}

	@Override
	public int compareTo(ListOfAccounts other) {
		int result = this.firstName.compareTo(other.firstName);
		if (result == 0) {
			result = this.lastName.compareTo(other.lastName);
		}
		return result;
	}

	// Comparator object for sorting based on balance
	public static Comparator<ListOfAccounts> balanceComparator = new Comparator<ListOfAccounts>() {
		@Override
		public int compare(ListOfAccounts a1, ListOfAccounts a2) {
			if (a1.balance < a2.balance) {
				return -1;
			} else if (a1.balance > a2.balance) {
				return 1;
			} else {
				return 0;
			}
		}
	};
}
