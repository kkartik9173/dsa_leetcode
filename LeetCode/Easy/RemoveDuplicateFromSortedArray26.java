package main.java.LeetCode.Easy;

public class RemoveDuplicateFromSortedArray26 {
    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray26
                removeDuplicate = new RemoveDuplicateFromSortedArray26();

        int[] nums = {0,1,2,3,3,4};
        int result = removeDuplicate.removeDuplicates(nums);
        System.out.println(result);
    }

    private int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
