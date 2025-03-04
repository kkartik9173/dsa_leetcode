package main.java.LeetCode.Medium;

public class PalindromeNumber9 {

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        long reversed = 0;
        int y = x;

        while (y > 0) {
            reversed = reversed * 10 + y % 10;
            y /= 10;
        }

        return reversed == x;
    }

    public static void main(String[] args) {
        boolean isPalindrome= PalindromeNumber9.isPalindrome(121);
        System.out.println(isPalindrome);
    }
}
