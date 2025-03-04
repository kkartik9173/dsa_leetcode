package main.java.LeetCode.Easy;

public class SortedArraySquare977 {

    public int[] sortedSquares(int[] nums) {

    int len= nums.length;
    int l= 0;
    int r= len-1;

    int[] result =new int[len];
    for (int i=len-1; i>=0; i--){
        if(Math.abs(nums[l]) > Math.abs(nums[r])){
            result[i] = nums[l] * nums[l];
            l++;
        } else {
            result[i] = nums[r] * nums[r];
            r--;
        }
    }
    return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] nums1 = {-7,-3,2,3,11};
        SortedArraySquare977 sortedArraySquare = new SortedArraySquare977();
        int[] arr = sortedArraySquare.sortedSquares(nums1);
        for (int a:arr)
            System.out.println("Sorted Array " + a);
    }

}
