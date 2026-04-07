public class Main {
    public static void main(String[] args) {
        MyStack<String> stringStack = new MyStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Top: " + stringStack.top());
        stringStack.pop();
        System.out.println("Size: " + stringStack.getSize());

        MyStack<Integer> intStack = new MyStack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println("Empty: " + intStack.isEmpty());
        System.out.println("Top: " + intStack.top());
    }
}
