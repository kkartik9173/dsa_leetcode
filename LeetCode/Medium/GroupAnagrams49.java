package main.java.LeetCode.Medium;

import java.util.*;

public class GroupAnagrams49 {

    public List<List<String>> groupAnagrams(String[] strs) {
//
//        if(strs == null || strs.length == 0) return new ArrayList<>();
//        Map<String, List<String>> hMap = new HashMap<>();
//        for (String s: strs) {
//            char[] ca = new char[26];
//           // char[] char = new char[26];
//            for(char ch: s.toCharArray()) {
//                ca[ch -'a']++;
//
//                String keyStr = String.valueOf(ch);
//                if(!hMap.containsKey(keyStr))
//                    hMap.put(keyStr, new ArrayList<>());
//
//                hMap.get(keyStr).add(s);
//             }
//            }
//        return new ArrayList<>(hMap.values());
//        }
//
//
//
//
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray())
                ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr))
                map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }


    public static void main(String[] args) {
        String[] nums = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams49 ga = new GroupAnagrams49();
        //ga.groupAnagrams(nums);
        System.out.println(ga.groupAnagrams(nums));
    }
}
