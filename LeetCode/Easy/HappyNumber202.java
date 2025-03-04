package main.java.LeetCode.Easy;

import java.util.HashSet;
import java.util.Set;

class HappyNumber202 {

    static boolean isHappy(int n) {

        Set<Integer> usedIntegers = new HashSet<>();
        while (true) {

            // Find the sum of squares
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2.0);
                n = n / 10;
                System.out.println("sum "+ sum);
                System.out.println("n "+ n);
            }

            // If sum is 1, return true
            if (sum == 1) return true;

            // Else, the new number is the current sum
            n = sum;

            if (usedIntegers.contains(n))
                return false;
            usedIntegers.add(n);
        }
    }

    public static void main(String[] args) {
        HappyNumber202.isHappy(7);
    }
}