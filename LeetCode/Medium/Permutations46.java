package main.java.LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations46 {
    public List<List<Integer>> getPermutation(int[] nums) {

        List<List<Integer>> lLInt = new ArrayList<>();

        backTrackPerm(lLInt, new ArrayList<>(), nums);
        System.out.println(lLInt);
        return lLInt;
    }

    private void backTrackPerm(List<List<Integer>> lLInt, List<Integer> temp, int[] nums) {

        if(temp.size() == nums.length){
            System.out.println("count");
            lLInt.add(new ArrayList<>(temp));
        }

        for(int num: nums){
            if(temp.contains(num)) continue;

            temp.add(num);
            backTrackPerm(lLInt, temp, nums);
            temp.remove(temp.size() -1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Permutations46 permutations = new Permutations46();
        permutations.getPermutation(nums);
    }

}
