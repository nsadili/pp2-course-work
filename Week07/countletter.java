public class countletter{
    public static void main(String[]args){
try{
        int a=2/0;
}
catch(ArithmeticException ex){
    System.out.print("Error happened "+ ex.toString());

}

}
}