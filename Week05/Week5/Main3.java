class NewA {
static {
    System.out.println("AS"); 
}

{ System.out.println("A"); }

public NewA() {
    System.out.println("AC"); 
}

public NewA(int x){ 
    System.out.println(x + " AC"); 
}
}

class GeneralType extends NewA {
static{
    System.out.println("GTS"); 
}

{   System.out.println("GT"); }

public GeneralType(){
    //super(5);
    System.out.println("GTC");
}
}

public class Main3 {
    public static void main(String args[]){
        //GeneralType gType = new GeneralType();
        //NewA newA = new NewA(5);
    } 
}

//Output:
/*
 * AS
 * GTS
 * A
 * AC
 * 0AC
 * GT
 * 5AC
 * GTC
 */


