public class Generics <T> {

    T someObject;


    public Generics(T obj) {
        this.someObject = obj;
    }

    public T getSomeObject() {
        return someObject;
    }

    public void setSomeObject(T obj) {
       this.someObject = obj;
    }

   public static void main(String[] args) {
    Generics <Integer> gc = new Generics <Integer>(6);
    Integer i = 15;
    gc.setSomeObject(123);
    Integer x = gc.getSomeObject();

    System.out.println(x);

   }
    
    
}