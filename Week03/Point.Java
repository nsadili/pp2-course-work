public class Point{
    /**
     *
     */
    private float x;
    /**
     * @param x
     * @param y
     * @param getX
     */
    public Point(final float x, final float y, final int getX) {
        this.x = x;
        this.y = y;
        this.getX = getX;
    }

    public Point(float x, float y, int getX) {
        this.x = x;
        this.y = y;
        this.getX = getX;
    }

    public void setX(float x) {
        this.x = x;
    }

    private float y;
    public int getX;

    public Point() {
        // EMPTY (DEFAULT) CONSTRUCTOR
        this.x = 3;
        this.y = 3;
        this(x:3, y:3);
    }

    /**
     * @param x
     * @param y
     */
    public Point(float x, float y) {
        this.x = x;
    }

    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }
}