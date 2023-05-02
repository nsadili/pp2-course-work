package Week09;

public class Test<T, U> {
    T key;
    U value;

    Test (T key, U value) {
        this.key = key;
        this.value = value;
     }

   public void print (){
      System.out.println(this.key + ":" + this.value);
   }

   

    
}
