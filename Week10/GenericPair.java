package Week10;

public class GenericPair <U, V> {
    private U key;
    private V value;
    public GenericPair(U key, V value){
this.key=key;
this.value=value;
    }
    public U getKey() {
        return this.key;
    }
    public V getValue() {
        return this.value;
    }
    public void setKey(U key) {
        this.key = key;
    }
    public void setValue(V value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "GenericPair [key=" + key + ", value=" + value + "]";
    }

    
}
class Main {
    public static void main(String[] args){
        GenericPair<Integer, String> Students= new GenericPair<Integer,String>(null, null)
   Students.setKey(16111);
   Students.setValue("Ilaha Jamalli");
   System.out.println(Students.getKey());
   System.out.println(Students.getValue());

    }
   
}