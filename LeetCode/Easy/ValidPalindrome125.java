package main.java.LeetCode.Easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ValidPalindrome125 {

    public static void main(String[] args) {
        String  s = "A man, a plan, a canal: Panama";
        ValidPalindrome125 vp
                = new ValidPalindrome125();

        System.out.println(vp.isPalindrome(s));
    }

    private boolean isPalindrome(String s) {

        String temp = s.replaceAll("\\P{Alnum}", "").toLowerCase();
        System.out.println(temp);
        return IntStream.range(0, temp.length()/2)
                        .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() -i -1));


    }


}
