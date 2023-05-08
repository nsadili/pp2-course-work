package bonus;

public abstract class Binary implements Eval {
    private Eval p1;
    private Eval p2;
    private String l;

    public Binary(String l, Eval p1, Eval p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.l = l;
    }

    protected abstract double calculate(Eval p1, Eval p2);

    @Override
    public double toValue() {
        return calculate(p1, p2);
    }

    @Override
    public String toString() {
        return "(" + p1.toString() + " " + l + " " + p2 + ")";
    }
}