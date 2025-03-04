package main.java.LeetCode.Easy;


import main.java.LeetCode.Util.ListNode;

public class Merge2SortedList21 {

    private static ListNode sortedMerge(ListNode l1, ListNode l2) {

        // Create a sentinal/dummy node to start
        ListNode returnNode = new ListNode(Integer.MIN_VALUE);

        // Create a copy of this node to iterate while solving the problem
        ListNode headNode = returnNode;

        // Traverse till one of the list reaches the end
        while (l1 != null && l2 != null) {

            // Compare the 2 values of lists
            if (l1.val <= l2.val) {
                returnNode.next = l1;
                System.out.println("returnNode.next " + returnNode.next);
                l1 = l1.next;
            } else {
                returnNode.next = l2;
                l2 = l2.next;
            }
            returnNode = returnNode.next;
        }

        // Append the remaining list
        if (l1 == null) {
            returnNode.next = l2;
        } else if (l2 == null) {
            returnNode.next = l1;
        }

        // return the next node to sentinal node
        return headNode.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);

        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Second linked list: 2 -> 3 -> 20
        ListNode list2 = new ListNode(3);
        list2.next = new ListNode(5);
        list2.next.next = new ListNode(6);

        ListNode resultNode = Merge2SortedList21.sortedMerge(list1, list2);
        Merge2SortedList21.printList(resultNode);

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