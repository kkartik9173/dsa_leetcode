package main.java.LeetCode.Medium;

import main.java.LeetCode.Util.ListNode;

import java.util.LinkedList;
import java.util.Queue;

public class AddTwoNumbers2 {
    private static ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        //Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        int x=0;


        while(list1 != null || list2 != null){
            int temp= ((list1 != null ? list1.val : 0) + (list2 != null ? list2.val : 0)
                    + x) % 10;
            x= ((list1 != null ? list1.val : 0) + (list2 != null ? list2.val : 0)
                    + x) / 10;

            queue.add(temp);
            list1 = list1 != null ? list1.next : null ;
            list2 = list2 != null ? list2.next : null ;
        } if(x > 0){
            queue.add(x);
            x=0;
        }

        ListNode resultList = new ListNode(Integer.MIN_VALUE);
        ListNode ptr = resultList;

        while(!queue.isEmpty()){
            ptr.next = new ListNode(queue.poll());
            ptr = ptr.next;
        }
        return resultList.next;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(9);
        l3.next = new ListNode(9);
        l3.next.next = new ListNode(9);
        l3.next.next.next = new ListNode(9);
        l3.next.next.next.next = new ListNode(9);
        l3.next.next.next.next.next = new ListNode(9);
        l3.next.next.next.next.next.next = new ListNode(9);
        ListNode l4 = new ListNode(9);
        l4.next = new ListNode(9);
        l4.next.next = new ListNode(9);
        l4.next.next.next = new ListNode(9);

        AddTwoNumbers2.addTwoNumbers(list1, list2);
        ListNode resultNode = AddTwoNumbers2.addTwoNumbers(l3, l4);
        ListNode.printList(resultNode);

    }


}
