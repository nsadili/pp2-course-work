
public class Stack<T>  {
        private int stackSize;
        private T[] stackArray;
        private int top;


        public Stack(int size) {
            this.stackSize = size;
            this.stackArray = (T[]) new Object[stackSize];
            this.top = -1;
        }

        public void push(T entry){
            if(top == stackSize - 1){
                System.out.println("Stack Overflow");
                T[] newStack = (T[]) new Object[this.stackSize*2];
                if (stackSize >= 0) System.arraycopy(this.stackArray, 0, newStack, 0, stackSize);
                this.stackArray = newStack;
                this.stackSize = this.stackSize*2;
            }
            System.out.println("Adding: "+entry);
            this.stackArray[++top] = entry;
        }

        public T pop(){
            if(top == -1){
                System.out.println("Stack underflow.");
            }
            T entry = this.stackArray[top--];
            System.out.println("Removed entry: "+entry);
            return entry;
        }

        public T peek() {
            return stackArray[top];
        }

}
