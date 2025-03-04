package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.ListNode;
import java.util.Stack;

public class ReverseLinkedList206 {

    private static ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        while(head != null){
            stack.push(head.val);
            head = head.next;
        }

        ListNode reverseList = new ListNode(Integer.MIN_VALUE);
        ListNode ptr = reverseList;

        while(!stack.isEmpty()){

            ptr.next = new ListNode(stack.pop());
            ptr = ptr.next;
        }

        return reverseList.next;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);

        //ListNode resultNode = ReverseLinkedList206.reverseList(list);
        ListNode resultNode = ReverseLinkedList206.reverseListEfficientWay(list);
        ListNode.printList(resultNode);
    }

    private static ListNode reverseListEfficientWay(ListNode head) {
        if(head == null) return null;

        if(head.next == null) return head;

        ListNode preNode = null;
        ListNode currentNode = head;

        while(currentNode != null){
            ListNode nextNode = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }

        head = preNode;
        return head;
    }
}
