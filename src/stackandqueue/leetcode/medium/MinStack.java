package stackandqueue.leetcode.medium;
//https://leetcode.com/problems/min-stack/
import java.util.Stack;

class MinStack {

    public MinStack() {

    }
    int min = Integer.MIN_VALUE;
    Stack<Integer> stack = new Stack<>();
    // only push the old minimum value when the current
    // minimum value changes after pushing the new value val
    public void push(int val) {
        if (val<=min){
            stack.push(min);
            min =val;
        }
        stack.push(val);
    }
// if pop operation could result in the changing of the current minimum value,
    // pop twice and change the current minimum value to the last minimum value.
    public void pop() {
        if (stack.pop()==min){
            min=stack.pop();
        }

    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return min;

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */