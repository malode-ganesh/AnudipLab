public class Stack01 {
    private int[] array;
    private int top;
    
    public Stack01(int capacity) {
        array = new int[capacity];
        top = -1;
    }
    
    public void push(int item) {
        if (top == array.length - 1) {
            throw new IllegalStateException("Stack is full");
        }
        array[++top] = item;
    }
    
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top--];
    }
    
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public static void main(String[] args) {
        Stack01 stack = new Stack01(5);
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek after pop: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
