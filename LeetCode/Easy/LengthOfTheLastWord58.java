package main.java.LeetCode.Easy;

public class LengthOfTheLastWord58 {
    public int lengthOfLastWord(String s) {
        int lastWordLength = 0;
        if(s.length() == 0 ) return lastWordLength;

        String[] ch = s.split(" ");
        lastWordLength = ch[ch.length-1].length();
        return lastWordLength;
    }

    public static void main(String[] args) {
        String s =  "   fly me   to   the moon  ";
        LengthOfTheLastWord58 length = new LengthOfTheLastWord58();
        System.out.println(length.lengthOfLastWord(s));

    }
}
