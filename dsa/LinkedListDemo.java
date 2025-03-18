package main.java.dsa;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList nums = new LinkedList();
        nums.add(5);
        nums.add(9);
        nums.add(12);
        System.out.println(nums);
        nums.addFirst(1);
        nums.addLast(15);
        System.out.println(nums);

        nums.remove(3);
        System.out.println(nums);

        System.out.println(nums.peek());
        System.out.println(nums.pop());
        System.out.println(nums);
    }
}
