package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.ListNode;

public class MiddleOfLinkedList876 {

    private static ListNode getMiddleNode(ListNode list) {
        int listLength = ListNode.countNodes(list);
        ListNode returnNode = list;
        int count = 0;
        int middleNode = listLength /2;
        while (count <= middleNode){
            if(count == middleNode){
                return returnNode;
            } else {
                count++;
                returnNode = returnNode.next;
            }
        }
        return list;
    }
    public static void printList(ListNode curr) {
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(" ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        //list.next.next.next.next.next = new ListNode(6);

        ListNode resultNode = MiddleOfLinkedList876.getMiddleNode(list);
        MiddleOfLinkedList876.printList(resultNode);

    }
}
