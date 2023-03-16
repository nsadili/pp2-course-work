package Week08.pw;

import java.util.*;

class Stack<T> {
    private LinkedList<T> _stack;

    public Stack(Collection<T> c) {
        if (c == null) _stack = new LinkedList<T>();
        else _stack = new LinkedList<T>(c);
    }

    public Stack() {
        this(null);
    }

    public void push(T el) {
        _stack.add(el);
    }

    public T pop() {
        return _stack.removeLast();
    }

    public T peek() {
        return _stack.getLast();
    }

    public void clear() {
        _stack.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = _stack.size() - 1; i >= 0; i--) {
            sb.append(_stack.get(i));
            if (i > 0) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> books = new Stack<String>();
        books.push("Thomas's Calculus");
        books.push("A Game of Thrones");
        books.push("Harry Potter and The Sorcerer's Stone");
        books.push("War and Peace");

        System.out.println(books);

        System.out.println(books.peek());
        books.pop();

        System.out.println(books);

        books.clear();
        System.out.println(books);

        List<Integer> l = new ArrayList<Integer>();
        Collections.addAll(l, 0, 4, 5, 2, 1, 1, 6, 8, 5);
        Stack<Integer> ints = new Stack<Integer>(l);

        System.out.println(ints);
    }
}
