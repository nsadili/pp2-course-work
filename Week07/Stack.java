package Week07;

public class Stack {
  private int[] data;
  private int top;

  public Stack(int size) {
    data = new int[size];
    top = -1;
  }

  public void push(int element) throws Exception {
    if (top == data.length - 1) {
      throw new Exception();
    }
    data[++top] = element;
  }

  public int pop() throws Exception {
    if (isEmpty()) {
      throw new Exception();
    }
    return data[top--];
  }

  public int peek() throws Exception {
    if (isEmpty()) {
      throw new Exception();
    }
    return data[top];
  }

  public boolean isEmpty() {
    return top == -1;
  }
}
