package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.ListNode;

public class RemovelinkedListElement203 {

    private static ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;
        while(curr.next != null){

            if(curr.next.val == val){
                curr.next = curr.next.next;
            } else{
                curr = curr.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {

//        Input: head = [1,2,6,3,4,5,6], val = 6
//        Output: [1,2,3,4,5]
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(6);
        list.next.next.next = new ListNode(3);
        list.next.next.next.next = new ListNode(4);
        list.next.next.next.next.next = new ListNode(5);
        list.next.next.next.next.next.next = new ListNode(6);
        int value= 6;

        //ListNode resultNode = RemovelinkedListElement203.reverseList(list);
        ListNode resultNode = RemovelinkedListElement203.removeElements(list, value);
        ListNode.printList(resultNode);
    }


}
