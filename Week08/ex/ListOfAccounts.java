package Week08.ex;

import java.util.Comparator;

public class ListOfAccounts {
    private String name;
    private String surname;
    private double balance;

    public ListOfAccounts(String name, String surname, double balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return "Customer: "+name+" "+surname+"\nBalance: "+balance+"\n";
    }

class AccountComparator implements Comparator <ListOfAccounts> {

    @Override
    public int compare(ListOfAccounts account1, ListOfAccounts account2) {
        if(account1.getName() + " " + account1.getSurname().compareTo(account2.getName()+account2.getSurname() > 0)) return 1;
    }
    return -1;


    
}
}
