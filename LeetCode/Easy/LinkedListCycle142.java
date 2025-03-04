package main.java.LeetCode.Easy;

import main.java.LeetCode.Util.ListNode;

public class LinkedListCycle142 {

        public static ListNode ifHasCycle(ListNode list) {
            
//        Set<ListNode> setOfListNode = new HashSet<>();
//        ListNode head = list;
//
//        while(list.next != null){
//            if(!setOfListNode.add(list)) {
//
//                return list;
//            }
//            list= list.next;
//        }
//        return null;

            ListNode tortoise = list;
            ListNode hare = list;

            // A fast pointer will either loop around a cycle and meet the slow
            // pointer or reach the `null` at the end of a non-cyclic list.
            while (hare != null && hare.next != null) {
                tortoise = tortoise.next;
                hare = hare.next.next;
                if (tortoise == hare) {
                    return tortoise;
                }
            }
            return null;
        }

        public static void main(String[] args) {
            ListNode list = new ListNode(3);
            list.next = new ListNode(2);
            list.next.next = new ListNode(0);
            list.next.next.next = new ListNode(-4);
            list.next.next.next.next = list;
            //list.next.next.next.next = new ListNode(6);

            ListNode cycleNode = main.java.LeetCode.Easy.LinkedListCycle142.ifHasCycle(list);
            LinkedListCycle142.printList(cycleNode);

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
    }

