package main.java.dsa;

public class InsertionSort {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4,5,3,11,1};
        int size = nums.length;
        int key = 0;
        int j = -1;

        System.out.println("Before sorting:- ");
        for (int num: nums) {
            System.out.print( num + " ");
        }
        int count = 0;

        for (int i = 1; i<size; i++) {
           key = nums[i];
           j = i-1;
           boolean shift = false;
           while(j>=0 && nums[j] > key){

               nums[j+1] = nums[j];
               j--;
               shift = true;
               count++;
           }
           if (shift)
                nums[j+1] = key;
        }

        System.out.println("\n" + count);
        System.out.println("After sorting:- ");
        for (int num: nums) {
            System.out.print( num + " ");
        }
    }
}
