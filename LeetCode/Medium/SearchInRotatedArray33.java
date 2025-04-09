package main.java.LeetCode.Medium;

public class SearchInRotatedArray33 {
    public int search1(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {

        if(nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1  ;

        if(nums[left] == target) return left;
        if(nums[right] == target) return right;

        while(left <= right){

            if(nums[left] == target) return left;
            if(nums[right] == target) return right;

            int mid = left + right / 2;
            if(nums[left] < nums[mid] ){
                System.out.println("first if "+ nums[left]);
                System.out.println(nums[mid]);
                left += 1;

            } else if(nums[mid] < nums[right]){
                System.out.println("second if "+ nums[left]);
                System.out.println(nums[mid]);

                right -= 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2,3};
        int target = 0;
        SearchInRotatedArray33 s = new SearchInRotatedArray33();
        int result = s.search1(nums, target);
        System.out.println("result " + result);

    }
}
