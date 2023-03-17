package pp2.week7;

import java.util.EmptyStackException;
import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> data;

    public Stack() {
        data = new ArrayList<>();
    }

    public void push(T value) {
        data.add(value);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.remove(data.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.get(data.size() - 1);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size() {
        return data.size();
    }
}
