public class Account implements Comparable<Account>{
    private String firstName;
    private String lastName;
    private Double balance;

    public Account(String firstName, String lastName, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Double getBalance(){
        return balance;
    }

    @Override
    public int compareTo(Account o) {
        int compFirsName = firstName.compareTo(o.firstName);

        if(compFirsName!=0) return compFirsName;
        return lastName.compareTo(o.lastName);

    }

}
