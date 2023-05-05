package Week10;

public class Gener<T, U>{
    private T tobj;
    private U uobj;

    public Gener(T tobj, U uobj) {
        this.tobj = tobj;
        this.uobj = uobj;
    }
    public T getTobj() {
        return tobj;
    }
    public void setTobj(T tobj) {
        this.tobj = tobj;
    }
    public U getUobj() {
        return uobj;
    }
    public void setUobj(U uobj) {
        this.uobj = uobj;
    }
}