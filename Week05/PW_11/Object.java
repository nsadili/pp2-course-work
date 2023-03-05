package Week05.PW_11;

public class Object {
    protected int width, height;
    public Object(){};
    public Object(int w, int h) {
        width = w;
        height = h;
    }
    public boolean equals(Object obj){
        if (obj.width == width && obj.height == height) return true;
        return false;
    }
}