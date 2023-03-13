package week7;
public class main{


public static void main(String[] args) {
    

    //Account acc = new Account();
    try{
        Account ACCOUNT = new Account(18008, null, 5000);
        ACCOUNT.withdraw(6666);
    }
    catch(Exception e)
        {
            System.out.println("Error: "+ e.getMessage());
            System.out.println(("In addition: "+ e.toString()));
            e.printStackTrace();
        }

    
}
}
