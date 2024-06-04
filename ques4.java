import java.util.Stack;

    public class ques4 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public ques4() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int val = stack.pop();
            if (val == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new RuntimeException("MinStack is empty");
    }

    public static void main(String[] args) {
        ques4 minStack = new ques4();
        minStack.push(1);
        minStack.push(2);
        minStack.push(0);
        System.out.println(minStack.getMin()); 
        minStack.pop();
        System.out.println(minStack.top());    
        System.out.println(minStack.getMin()); 
    }
}
