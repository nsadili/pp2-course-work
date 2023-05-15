package Week11;

public interface AFunction{
    public void apply(String o1);
    static void print(String o2){
        System.out.println(o2);
    } 
    default void print(String o3, String o4){
        System.out.println("First: "+ o3 +" and Second: "+ o4);
    }
}