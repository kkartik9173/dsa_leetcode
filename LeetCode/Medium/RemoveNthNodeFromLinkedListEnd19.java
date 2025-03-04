package main.java.LeetCode.Medium;

import main.java.LeetCode.Util.ListNode;

public class RemoveNthNodeFromLinkedListEnd19 {

    private static ListNode removeNode(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode firstPtr = dummyNode;
        ListNode secondPtr = dummyNode;

        for (int i = 0; i < n; i++) {
            secondPtr = secondPtr.next;
        }

        while( secondPtr.next != null){
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }
        firstPtr.next = firstPtr.next.next;

        return dummyNode.next;
    }



    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);

        ListNode resultNode = RemoveNthNodeFromLinkedListEnd19.removeNode(list, 2);
        ListNode.printList(resultNode);
    }


}
