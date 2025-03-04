package main.java.LeetCode.Medium;

import java.util.Stack;

public class MinStack155 {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack155() {
        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.peek() >= val){
            minStack.push(val);
        }
    }

    public void pop() {
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack155 minstack = new MinStack155();
        minstack.push(-2);
        minstack.push(-5);
        minstack.push(89);
        minstack.push(0);
        minstack.pop();
        minstack.top();
        System.out.println(minstack.getMin());
        minstack.pop();
        minstack.pop();
        minstack.pop();
        minstack.push(-1);

        System.out.println(minstack);
        System.out.println(minstack.getMin());


    }
}
