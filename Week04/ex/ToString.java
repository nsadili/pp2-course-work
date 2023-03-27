public class ToString {
    private int a;
    private int b;

    public ToString(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(a).append(", ").append(b).append(")");
        return sb.toString();
    }
}