package Week08.EX; 

public class Account2 implements Comparable<Account2> {
    
    private String Name;
    private String LastName;
    private double balance;
    
    public Account2( String Name , String LastName, double balance ){
        
        this.Name = Name;
        this.LastName = LastName;
        this.balance = balance;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

 
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        Name = name;
    }


    public double getBalance() {
        return balance;
    }
    

    @Override
    public String toString() {
        return String.format("{ %s, %s: %f }", getLastName(), getName(), balance);
    }

    @Override
    public int compareTo(Account2 o){
        int compFirstName = Name.compareTo(o.Name);

        if(compFirstName != 0 ){
            return compFirstName;;    
        }

        
        return 0 ;
    }

   

}
    


