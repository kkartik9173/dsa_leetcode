package main.java.LeetCode.Easy;

import java.util.*;

public class DuplicateInArray219 {
    public boolean containsDuplicate(int[] nums, int k) {

//        Map<Integer, Integer>  hm= new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!hm.containsKey(nums[i])) {
//                hm.put(nums[i], i);
//            } else {
//                int previousIndex = hm.get(nums[i]);
//                if (Math.abs(previousIndex - i) <= k){
//                    return true;
//                }else {
//                    hm.put(nums[i], i);
//                }
//            }
//        }
//        return false;

        // Initialize a HashMap to store the value and its most recent index
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int currentIndex = 0; currentIndex < nums.length; ++currentIndex) {
            // Use getOrDefault to find the last index of the current number.
            // If it's not found, use a default value that is far away from any possible index.
            int lastIndex = indexMap.getOrDefault(nums[currentIndex], -1000000);

            // Check if the current index and the last index of the same value are within k steps
            if (currentIndex - lastIndex <= k) {
                // If so, we found a nearby duplicate and return true.
                return true;
            }

            // Update the map with the current value and its index for the next iteration checks
            indexMap.put(nums[currentIndex], currentIndex);
        }

        // If no nearby duplicates are found, return false.
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,3,4,1};
        int[] nums1 = {1,2,3,1,2,3};
        int k =2;

        DuplicateInArray219 duplicateInArray219 = new DuplicateInArray219();
        System.out.println("Is array contains duplicate:- "+ duplicateInArray219.containsDuplicate(nums1, k));

    }
}
