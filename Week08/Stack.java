package Week08;
import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> list;

    public Stack() {
        list = new LinkedList<>();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(int data) {
        list.addFirst(data);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.getFirst();
    }

    public void printStack() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
