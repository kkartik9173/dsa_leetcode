package main.java.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TestClass {

    public static void main(String[] args) {

        String str = "hello world";

        Map<Character, Integer> hMap = new HashMap<>();

        String vowels = "eaiou";

        for (int i = 0; i < str.length() -1; i++) {

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u'){
                if(hMap.containsKey(str.charAt(i))){
                    int count = hMap.get(str.charAt(i));
                    hMap.put(str.charAt(i),++count);
                }

                else
                    hMap.put(str.charAt(i), 1);

            }
        }

        System.out.println(hMap);


    }

}
