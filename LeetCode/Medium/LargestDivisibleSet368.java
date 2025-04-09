package main.java.LeetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//        Example 1:
//
//        Input: nums = [1,2,3]
//        Output: [1,2]
//        Explanation: [1,3] is also accepted.
//        Example 2:
//
//        Input: nums = [1,2,4,8]
//        Output: [1,2,4,8]

public class LargestDivisibleSet368 {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);  // Step 1: Sort the array
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();  // Final answer
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(); // Stores best subset for each number

        // Step 2: Process from end to beginning
        for (int i = n - 1; i >= 0; i--) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(nums[i]);  // Start a new subset with nums[i]
            ArrayList<Integer> toAdd = new ArrayList<>();  // Best subset we can append to nums[i]

            // Step 3: Check all elements after nums[i]
            for (int j = i + 1; j < n; j++) {
                if (nums[j] % nums[i] == 0) {  // Only consider divisible elements
                    System.out.println("map.get(nums[j]).size() " + map.get(nums[j]).size());
                    if (map.get(nums[j]).size() > toAdd.size()) {
                        toAdd = map.get(nums[j]);  // Keep the longest valid subset
                        System.out.println("toAdd "+ toAdd);
                    }
                }
            }

            list.addAll(toAdd);  // Extend subset
            map.put(nums[i], new ArrayList<>(list));  // Store it in map

            System.out.println("list " + list);
            System.out.println("ans b4" + ans);

            if (ans.size() < list.size()) {
                ans = new ArrayList<>(list);  // Update final answer if this subset is longer
            }
            System.out.println("ans after" + ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] intArray = {1,2,3};
        LargestDivisibleSet368 largest = new
                LargestDivisibleSet368();
        List<Integer> integerList = largest.largestDivisibleSubset(intArray);
        System.out.println(integerList);
    }
}
