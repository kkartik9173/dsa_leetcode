package main.java.LeetCode.Easy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplStackUsingQueues225 {
    Queue<Integer> myQueue;
    public ImplStackUsingQueues225() {
        myQueue = new LinkedList<>();
    }

    public void push(int x) {
        myQueue.add(x);
        for(int i=1; i < myQueue.size(); i++){
            myQueue.add(myQueue.remove());
        }
    }

    public int pop() {
        return myQueue.remove();
    }

    public int top() {
        return myQueue.peek();
    }

    public boolean empty() {
        return myQueue.isEmpty();
    }
}
