public class GeneralClass <T> {
    private T obj;
 
    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {
        GeneralClass<Integer> gc = new GeneralClass<Integer>();

        Integer i = 20;
        gc.setObj(i);
        System.out.println(gc.getObj());
    }
}