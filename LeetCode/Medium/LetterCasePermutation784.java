package main.java.LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation784 {
    public List<String> letterCasePermutation(String s) {

//        List<String> lString = new ArrayList<>();
//        lString.add(s);
//        StringBuilder s1 = new StringBuilder(s);
//        boolean isValueChanged = false;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            if(Character.isLetter(c) && !isValueChanged){
//                char lowerOrUpperCase = Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
//                s1.append(lowerOrUpperCase);
//                isValueChanged = true;
//            } else {
//                s1.append(c);
//            }
//
//            if( i == (s.length()-1) ){
//                lString.add(s1.toString());
//                isValueChanged = false;
//            }
//        }
//
//
//        lString.add(s);
//        return lString;
        List<String> lString = new ArrayList<>();
        if(s.length() == 0 )
            return lString;

        getAllPermRec(s.toCharArray(), lString, 0);
        return lString;
    }

    private void getAllPermRec(char[] str, List<String> lString, int i) {
        if(str.length == i){
            lString.add(new String(str));
            return;
        }
        if(Character.isDigit(str[i])){
            getAllPermRec(str, lString, i+1);
            return;
        } else{
            str[i] =Character.toLowerCase(str[i]);
            getAllPermRec(str, lString, i+1);

            str[i] =Character.toUpperCase(str[i]);
            getAllPermRec(str, lString, i+1);
        }
    };

    public static void main(String[] args) {
        LetterCasePermutation784 letterCasePermutation = new LetterCasePermutation784();

        List<String> s = letterCasePermutation.letterCasePermutation("a1b2");
        System.out.println("s:- " + s);
    }


}
