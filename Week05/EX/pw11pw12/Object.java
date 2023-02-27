package EX.pw11pw12;

public class Object {
    int width, height;
    public Object(){};
    public Object(int w, int h) {
        width = w;
        height = h;
    }
    public boolean equals(Object o){
        if (o.width == width && o.height == height) return true;
        return false;
    }
}
