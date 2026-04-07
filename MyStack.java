public class MyStack {
    private int stackPointer = 0;
    private int[] elements = new int[100];

    public int top() {
        if (isEmpty()) throw new RuntimeException("Stack empty");
        return elements[stackPointer - 1];
    }

    public void push(int n) {
        if (stackPointer == elements.length) throw new RuntimeException("Stack full");
        elements[stackPointer++] = n;
    }

    public void pop() {
        if (isEmpty()) throw new RuntimeException("Stack empty");
        stackPointer--;
    }

    public boolean isEmpty() {
        return stackPointer == 0;
    }

    public int getSize() {
        return stackPointer;
    }
}
