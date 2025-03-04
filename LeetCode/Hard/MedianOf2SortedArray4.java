package main.java.LeetCode.Hard;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianOf2SortedArray4 {

    public static int[] mergeArraysUsingStreams(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c = mergeArraysUsingStreams(nums1, nums2);

        Arrays.sort(c);
        double median = 0.0;
        if(c.length%2==0){
            median =  (c[(c.length-1)/2] + c[c.length/2])/2.0;
        } else
            median =  c[c.length/2];

        return median;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3};

        MedianOf2SortedArray4 medianOf2SortedArray = new MedianOf2SortedArray4();
        medianOf2SortedArray.findMedianSortedArrays(num1, num2);
    }
}
