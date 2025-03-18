package main.java.LeetCode.Easy;

public class LongestCommonPrefix14 {

    public String longestCommonPrefix(String[] strs) {
       String prefix = strs[0];

        System.out.println(strs[0].indexOf(prefix));
       for (int i =1; i < strs.length; i++){
           while(strs[i].indexOf(prefix) != 0){
               prefix = prefix.substring(0, prefix.length() - 1);
           }
       }
       return prefix;

    }

    public static void main(String[] args) {
        String[]  strs = {"flower","flow","fight"};
        LongestCommonPrefix14 longestPrefix
                = new LongestCommonPrefix14();
        String result = longestPrefix.longestCommonPrefix(strs);

        System.out.println(result);

    }


}
