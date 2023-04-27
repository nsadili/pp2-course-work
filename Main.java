public class Main{

    public static void main(String[]args){

        AFuncInt f = new AFuncInt(){
     public void apply(String str){

        System.out.println("ANONYMOUS -> " + str);

     } 
     //@Override

     //public void print(String str1, String str2){
       // System.out.println("DEFAULT ->" + str1 + " ; " + str2);

     }

        };

        //f.apply(str:"Hello");
        //AFuncInt.print(str:"Hello");
        //f.print(str1:"Hello", str2:"World");

        AFuncInt lambda =  (str) -> System.out.println("LAMBDA -> " + str);
    lambda.apply(str:"Farewell");
    lambda.print(str1:"Farewell", str2:"friend");
    
    }
}