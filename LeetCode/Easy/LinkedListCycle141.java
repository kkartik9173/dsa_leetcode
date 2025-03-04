package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.ListNode;

public class LinkedListCycle141 {

    public static boolean hasCycle(ListNode list) {
//        Set<ListNode> setOfListNode = new HashSet<>();
//        ListNode head = list;
//        if(list == null) return false;
//        while(list.next != null){
//            if(!setOfListNode.add(list)) {
//                return true;
//            }
//            list= list.next;
//        }
//        return false;

        ListNode slowPtr = list;
        ListNode fastPtr = list;

        while(slowPtr != null
            && fastPtr != null
            && fastPtr.next != null){

            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if(slowPtr == fastPtr) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(3);
        list.next = new ListNode(2);
        list.next.next = new ListNode(0);
        list.next.next.next = new ListNode(-4);
        list.next.next.next.next = list;
        //list.next.next.next.next = new ListNode(6);

        boolean hasCycle = LinkedListCycle141.hasCycle(list);
        System.out.println(hasCycle);

    }
}
