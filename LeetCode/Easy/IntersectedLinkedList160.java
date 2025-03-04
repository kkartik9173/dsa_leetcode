package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.ListNode;

public class IntersectedLinkedList160 {

    private static ListNode getIntersectedNode(ListNode list1, ListNode list2) {
        int list1Length = ListNode.countNodes(list1);
        int list2Length = ListNode.countNodes(list2);

        while(list1Length > list2Length){
            list1Length--;
            list1 = list1.next;
        }
        while(list2Length > list1Length){
            list2Length--;
            list2 = list2.next;
        }

        while(list1 != list2){
            list1 = list1.next;
            list2 = list2.next;
        }

        IntersectedLinkedList160.printList(list1);
        return list1;

    }

    static void printList(ListNode curr) {
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

        ListNode list1 = new ListNode(4);

        list1.next = new ListNode(1);
        list1.next.next = new ListNode(8);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);

        // Second linked list: 2 -> 3 -> 20   [5,6,1,8,4,5
        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(1);
        list2.next.next.next = new ListNode(8);
        list2.next.next.next.next = new ListNode(4);
        list2.next.next.next.next.next = new ListNode(5);

        ListNode resultNode = IntersectedLinkedList160.getIntersectedNode(list1, list2);
        //IntersectedLinkedList160.printList(resultNode);
    }
}


