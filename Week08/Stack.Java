public class LinkedListStack<T> {
    private LinkedList<T> list;

    public LinkedListStack() {
        list = new LinkedList<T>();
    }

    public void push(T value) {
        list.addFirst(value);
    }

    public T pop() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.removeFirst();
    }

    public T peek() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
