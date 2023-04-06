package generics;

public class GenericPair<A,B> {
    private A a;
    private B b;

    public GenericPair(A a, B b){
        this.a=a;
        this.b=b;
    }
    public A getA() {
        return a;
    }
    public B getB() {
        return b;
    }
    public void setA(A a) {
        this.a = a;
    }
    public void setB(B b) {
        this.b = b;
    }
    @Override
    public String toString() {
        return getA()+" and "+getB();
    }

    public static void main(String[] args) {
        GenericPair<Integer, Character> s = new GenericPair<>(31,'S');
        System.out.println(s);
        System.out.println(s.getA());

    }
}
