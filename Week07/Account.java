package Week07;

public class Account {
    
    int id;
    private double balance = 0.0;
     double takemoney;
    private Costumer customer;
    public Account(int id, Costumer customer, double balance){
       this.id = id;
       this.customer = customer;
       this.balance = balance;
    }
    public Account(int id, Costumer customer){
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }
    public int getID(){
        return id;
    }
    public Costumer getCustomer(){
        return customer;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
     public  void withdraw(double takemoney) throws Exception{
        if(takemoney <= balance){
             System.out.println("Successful, remain Balance: " + (balance - takemoney));
        }
        else throw new Exception("trying to take away money more than balance ");
     }
    public String toString(){
        return String.format("%s(%d) %.2f", ((Costumer) customer).getName(), id, balance );
         
    }

}
