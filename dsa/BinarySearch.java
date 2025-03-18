package main.java.dsa;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {5,7,9,11,13};

        int target = 9;

        int result = binarySearch(nums, target);

        if(result != -1)
            System.out.println("ELement found at index "+ result);
        else
            System.out.println("Element not found");

    }

    private static int binarySearch(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        while(leftIndex <= rightIndex ){
            int mid = (leftIndex + rightIndex)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target){
                leftIndex = mid + 1;
            } else
                rightIndex = mid - 1;
        }
        return -1;
    };
}
