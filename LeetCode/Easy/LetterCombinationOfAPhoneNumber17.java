package main.java.LeetCode.Easy;

import java.util.*;

public class LetterCombinationOfAPhoneNumber17 {

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(0,"", digits, res, map);
        return res;
    }
    public void backtrack(int i, String curr, String digits, List<String> res, HashMap<Character, String> map ){
        if(i == digits.length()){
            res.add(curr);
            return;
        }
        for(char ch: map.get(digits.charAt(i)).toCharArray()){
            backtrack(i+1, curr + ch, digits, res, map);
        }
    }

    public static void main(String[] args) {
        String digits = "234";
        LetterCombinationOfAPhoneNumber17 letterCombination
                = new LetterCombinationOfAPhoneNumber17();
        List<String> s= letterCombination.letterCombinations(digits);
        System.out.println("s " + s);


    }
}
