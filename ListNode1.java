package main.java;

public class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1() {}
      ListNode1(int val) { this.val = val; }
      ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode1{" +
                "val=" + val +
                ", listNode=" + next +
                '}';
    }

    public static void main(String[] args) {
        ListNode1 head = new ListNode1(2);
        head.next = new ListNode1(3);
        head.next = new ListNode1(3);
        head.next = new ListNode1(4);
        head.next = new ListNode1(5);
        head.next = new ListNode1(6);
        ListNode1 ln1 = new ListNode1();
        ListNode1 resultNode =  ln1.getDuplicates(head);

    }

    private ListNode1 getDuplicates(ListNode1 head) {
        if (head == null) return null;

        ListNode1 current = head;

        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current = current.next;
                return current;
            }

        }
        return current;
    }
}
