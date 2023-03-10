package pw;

public class AccountClass {
    public static void main(String[] args){
        Account acc = new Account(1232);
        try{
            acc.withdraw(121312);
        }catch(Exception a){
            System.out.println(a);
        }
    }
}

class InvalidAmountException extends Exception {

    public InvalidAmountException(String message) {
        super(message);
    }
}

//didnt wrote account class last week thats why created a simple class

class Account{
    private int balance;
    Account(int balance){
        this.balance = balance;
    }
    void withdraw(int amount) throws InvalidAmountException{
        if(amount<=this.balance){
            this.balance = this.balance - amount;
        }else{
            throw new InvalidAmountException("Amount is not enough");
        }
    }
}
