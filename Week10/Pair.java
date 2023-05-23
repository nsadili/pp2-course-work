

public class Pair <U, W> {
    
    private U key; //can be public or default as well
    
    private W value;  // private bc of encaps, so that no direct access will be possible
    
    public Pair(U key, W value) {
        
        this.key = key ;
        
        this.value = value;
    }

    public U getKey() {
        return this.key ;
    }

    public W getValue() {
        return this.value;
    }

    public void setKey(U key){
        this.key = key;
    }

    public void setValue(W value){
        this.value = value;
    }

 public String toString() {
    
 }

    public static void main(String[] args) {
        Pair<Integer, String> students = new Pair<>();
        students.setKey(17248);
        students.setvalue("Leyla");
        System.out.println(students.toString());
    }

}
