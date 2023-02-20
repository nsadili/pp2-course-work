public class ToString {
    private int x;
    private int y;

    public ToString(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(x).append(", ").append(y).append(")");
        return sb.toString();
    }
}
