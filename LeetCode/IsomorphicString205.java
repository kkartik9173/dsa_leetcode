package main.java.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicString205 {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(Integer i = 0; i <s.length(); i ++) {
            System.out.println(map1.put(s.charAt(i), i));
            System.out.println(map2.put(t.charAt(i), i));
            if(map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "foo";
        String t = "bar";
        IsomorphicString205 is = new IsomorphicString205();
        is.isIsomorphic(s, t);
    }

}
