package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.ListNode;

public class RemoveDuplicateSortedList83 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;

        ListNode temp = head;

        while(temp.next != null){
            if(temp.val == temp.next.val)
                temp.next = temp.next.next;
            else
                temp = temp.next;

        }
        return head;
    }

    public static void main(String[] args) {

        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);

        RemoveDuplicateSortedList83 duplicate
                = new RemoveDuplicateSortedList83();
        ListNode node = duplicate.deleteDuplicates(list);
        printList(node);

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

}
