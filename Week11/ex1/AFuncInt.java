public interface AFuncInt {
    void apply(String a); //public and abstract

    static void print(String a){
        System.out.println("STATIC: "+a);
    }
    default void print(String a, String b){
        System.out.println("DEFAULT: "+a+" and "+b);
    }
}
