package main.java.LeetCode.Medium;

import main.java.LeetCode.Util.ListNode;

public class ReverseLinkedList92 {

    public static void main(String[] args) {
        ListNode list = new ListNode(4);
        list.next = new ListNode(8);
        list.next.next = new ListNode(15);
        list.next.next.next = new ListNode(16);
        list.next.next.next.next = new ListNode(23);
        list.next.next.next.next.next = new ListNode(42);
        int left = 3;
        int right = 5;

        ListNode resultNode = ReverseLinkedList92.reverseListEfficientWay(list, left, right);
        ListNode.printList(resultNode);
    }

    private static ListNode reverseListEfficientWay(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftPre = dummy;
        ListNode currNode = head;

        for(int i=0; i< left-1; i++){
            leftPre = leftPre.next;
            currNode = currNode.next;
        }

        ListNode subListHead = currNode;
        ListNode preNode = null;

        for (int i = 0; i <= right -left ; i++) {
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        leftPre.next = preNode;
        subListHead.next= currNode;

        return dummy.next;
    }
}
