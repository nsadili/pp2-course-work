package EX;

public class Main {
    public static void main(String[] args) {
        
        AFuncInt f = new AFuncInt() {
          
            @Override
            public void apply(String str){
             System.out.println("Anonymous ->" + str);
            }

         //   @Override
         //   public  void print(String str1, String str2){
          //  System.out.println("Overriden ->" + str1 + ";"+ str2);

          //  }
    };

//    f.apply("hello");
 //   AFuncInt.print("Hello");
  //  f.print("hello", "world");

  AFuncInt lambda = str-> System.out.println("Lambda->" + str);
  
  lambda.apply("farewell");
  lambda.print("sun", "moon");
}
}