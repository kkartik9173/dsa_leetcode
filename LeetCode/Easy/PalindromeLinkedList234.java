package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.ListNode;

public class PalindromeLinkedList234 {
    private static boolean isPalindrome(ListNode head) {
        //Find the middle of the linked list
        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null){  //odd nodes: let right half smaller
            slow = slow.next;
        }

        //Reverse the second half of linked list
        slow = reverseList(slow);
        fast = head;

        while(slow != null){
            if (fast.val != slow.val)
                return false;

            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }
    private static ListNode reverseList(ListNode head) {
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
    public static void main(String[] args) {


        ListNode list = new ListNode(2);
        list.next = new ListNode(3);
        list.next.next = new ListNode(7);
        list.next.next.next = new ListNode(7);
        list.next.next.next.next = new ListNode(3);
        list.next.next.next.next.next = new ListNode(2);

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(2);
        list1.next.next.next.next = new ListNode(1);

        boolean isPalindrome = PalindromeLinkedList234.isPalindrome(list);
        System.out.println(isPalindrome);
    }
}
