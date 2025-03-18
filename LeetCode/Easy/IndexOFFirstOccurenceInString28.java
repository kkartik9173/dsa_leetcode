package main.java.LeetCode.Easy;

public class IndexOFFirstOccurenceInString28 {

    public int strStr(String haystack, String needle) {
        for(int i=0, j = needle.length() ; j <= haystack.length(); i++, j++){
            System.out.println(haystack.substring(i,j));
            if(haystack.substring(i,j).equals(needle)){

                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        IndexOFFirstOccurenceInString28 idx =new IndexOFFirstOccurenceInString28();
        System.out.println("index " + idx.strStr(haystack,needle));
    }
}
