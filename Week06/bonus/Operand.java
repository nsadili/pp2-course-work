package bonus;

public class Operand implements Eval {

    private double val;
    private String l;

    public Operand(String label, double value) {
        this.l = label;
        this.val = value;
    }

    @Override
    public double toValue() {
        return val;
    }

    @Override
    public String toString() {
        return l;
    }

}