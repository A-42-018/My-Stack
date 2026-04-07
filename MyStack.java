import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> elements = new ArrayList<>();

    public int top() {
        return elements.get(elements.size() - 1);
    }

    public void push(int n) {
        elements.add(n);
    }

    public void pop() {
        elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int getSize() {
        return elements.size();
    }
}
