package main.java.LeetCode.Easy;

import java.util.Arrays;

public class MergeSortedArray88_1 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

      int i = m-1 ,j = n-1;
      int k = m + n -1;
      while (i >= 0 && j >= 0){

          if(nums1[i]>= nums2[j]){
              nums1[k--] = nums1[i--];
          } else
              nums1[k--] = nums2[j--];

          if(j >= 0){
              nums1[k--] = nums2[j--];
          }
      }
        System.out.println(Arrays.toString(nums1));
    };

    public static void main(String[] args) {



        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {1,2,5};
        int n = 3;

        MergeSortedArray88_1 mergeSortedArr1= new MergeSortedArray88_1();
        mergeSortedArr1.merge(nums1, m, nums2, n);
    }
}
