public class Account {
    private Customer Nasib;
    private char male;
    

    public Account(int id, Customer c, int male){
    this.Nasib = c;
}
    public Account(int id, Customer Nasib, char male ){
        this.Nasib =Nasib;
        this.male =male;
    }
     public Customer getNasib() {
        return Nasib;
    }
    public void setNasib(Customer nasib) {
        Nasib = nasib;
    }
    public int getId() {
        return 16076;
     }
     public void setID(int id) {
        id = 16076;
     }
     public char getMale() {
        return this.getMale();
     }
     public void setMale(char male, char c){
        male = c;
     }
     public String toString() {
     return String.format("%s(%d)", this.male, this.Nasib);
     }
    public Object withdraw(int i) {
        return null;
    }
    public Object deposit(int i) {
        return null;
    }
}


