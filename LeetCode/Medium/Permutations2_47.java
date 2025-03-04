package main.java.LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations2_47 {
    public List<List<Integer>> getPermutation(int[] nums) {

        List<List<Integer>> lLInt = new ArrayList<>();

        backTrackPerm(lLInt, new ArrayList<>(), nums, new boolean[nums.length]);
        System.out.println(lLInt);
        return lLInt;
    }

    private void backTrackPerm(List<List<Integer>> lLInt, List<Integer> temp, int[] nums,
                               boolean[] used) {

        if(temp.size() == nums.length
            && (!lLInt.contains(temp))){
            System.out.println("count");
            lLInt.add(new ArrayList<>(temp));
        }

        for(int i =0; i< nums.length; i++){
            if(used[i]) continue;

            temp.add(nums[i]);
            used[i] = true;
            backTrackPerm(lLInt, temp, nums, used);
            temp.remove(temp.size() -1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] nums2 = {1,2,3};
        Permutations2_47 permutations = new Permutations2_47();
        permutations.getPermutation(nums);
    }

}
