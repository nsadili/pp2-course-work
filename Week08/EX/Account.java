package EX;
public class Account{
    private String fName;
    private String lName;
    private String balance; 

    public Account(String fName, String lName, String balance)
    {
        this.fName= fName;
        this.lName= lName;
        this.balance= balance;
    }


    @Override
    public String toString()
    {
        return balance;
       
        
    }

}
