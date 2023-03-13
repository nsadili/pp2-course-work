@Override
public Segment clone() {
    try {
        return (Segment) super.clone();
    } catch (CloneNotSupportedException e) {
        throw new AssertionError();
    }
}

//here's the represetative of the shallow clone in the code