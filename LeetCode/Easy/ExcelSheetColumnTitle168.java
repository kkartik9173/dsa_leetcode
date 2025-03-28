package main.java.LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle168 {

    public String convertToTitle(int columnNumber) {
        StringBuilder st=new StringBuilder();
        while(columnNumber>0)
        {
            int r=(columnNumber-1)%26;  //for columnNumber 35, r =8 then column number = 1 and r=0
            st.append((char)(r+'A'));   //st = 0 =73 then 1 =65 (or IA)
            columnNumber=(columnNumber-1)/26; //coulumn number = 1, then columnNumber = 1
        }
        return st.reverse().toString();
    }

    public int titleToNumber(String columnTitle) {
        if (columnTitle == null) return -1;
        int sum = 0;
        // for each loop so we don't need to mess with index values.
        for (char c : columnTitle.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }


    public static void main(String[] args) {
        ExcelSheetColumnTitle168 es1 = new ExcelSheetColumnTitle168();

        String s = es1.convertToTitle(701); //AI

        System.out.println(s);

        ExcelSheetColumnTitle168 es2 = new ExcelSheetColumnTitle168();
        int i = es2.titleToNumber(s);
        System.out.println(i);
    }
}
