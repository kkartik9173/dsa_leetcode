package main.java.dsa;

public class BubbleSort {
    public static void main(String[] args) {

        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp = 0;

        System.out.println("Before sorting:- ");
        for (int num: nums) {
            System.out.print( num + " ");
        }
        int count = 0;

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size-i-1; j++) {
                count++;
                if (nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }
        System.out.println("\n" + count);
        System.out.println("After sorting:- ");
        for (int num: nums) {
            System.out.print( num + " ");
        }
    }
}
