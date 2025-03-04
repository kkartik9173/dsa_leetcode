package main.java.LeetCode.Medium.Heap;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray215 {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k+1);
        for(int i:nums){
            pq.add(i);
            System.out.println(pq);
            if(pq.size()>k) {
                pq.poll();
                System.out.println(pq);
            }
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        KthLargestElementInAnArray215 kthLargestElementInAnArray
                = new KthLargestElementInAnArray215();

        int kthLargestElement = kthLargestElementInAnArray.findKthLargest(nums, 4);

    }
}
