package main.java.LeetCode.Medium;

public class LongestMountainArray845_1 {
    private int getLongestMountain(int[] nums) {

        int n= nums.length;
        int count = 1;
        int ans=0;

        for (int i = 1; i< n-2;) {

            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){ //neighbours check for a peak point

                int j=i;
                while(j>0 && nums[j] > nums[j-1]){  //increasing
                    j--;
                    count++;
                }
                while(i<n-1 && nums[i] > nums[i+1]){  //decreasing
                    i++;
                    count++;
                }
            ans = Math.max(count, ans);   //get max as we can have other mountains as well.
            } else {
                i++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,4,7,3,2,5};//5
        int[] nums1 = {2,2,2}; //0
        int[] nums2 = {0,1,2,3,4,5,4,3,2,1,0};  //11

        LongestMountainArray845_1 longestMountainArray = new LongestMountainArray845_1();
        System.out.println(longestMountainArray.getLongestMountain(nums2));
    }
}
