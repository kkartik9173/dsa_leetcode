package main.java.LeetCode.Medium.Heap;

import main.java.LeetCode.Medium.BinaryTree.KthSmallestElementInBST230;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthClosestElement973 {

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(
                Comparator.comparing(a-> -((a[0] * a[0]) + a[1] * a[1]))
        );

        for(int[] point:points){
            pq.offer(point);
            if(pq.size()>k){
                pq.poll();
            }

        }
        return pq.toArray(new int[k][2]);
    }
    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int k = 1;

        KthClosestElement973 kthClosestElement973 = new KthClosestElement973();
        int[][] result = kthClosestElement973.kClosest(points, k);
        for (int[] n : result) {
            for (int i:n) {
                System.out.println(i);
            }

        }
    }
}
