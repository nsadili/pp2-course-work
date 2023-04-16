package Week10.ex5;

import java.util.LinkedList;
import java.util.Collection;

public class Stack<T> {
    private LinkedList<T> _stack;

    public Stack(Collection<? extends T> coll) {
        this._stack = new LinkedList<>(coll);
    }

    public Stack() {
        this._stack = new LinkedList<>();
    }

    public <E extends T> void push(E el) {
        _stack.add(el);
    }

    public T pop() {
        return _stack.removeLast();
    }

    public T peek() {
        return _stack.getLast();
    }
}
