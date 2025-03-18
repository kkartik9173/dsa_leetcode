package main.java.LeetCode.Medium;

public class StringAtoI8 {

    private int myAtoI(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int i = 0;
        int sign = 1;
        int result = 0;
        while (i < s.length() && s.charAt(i) == ' ') //Skip the Spaces
        {
            i++;
        }
        //The Sign of the Number is calculated
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if(s.charAt(i)=='-')
                sign=-1;

            else
                sign=1;
            i++;
        }
        //Now We find the Number
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                if(sign==1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        String s= "-+12";
        StringAtoI8 s1 = new StringAtoI8();
        System.out.println(s1.myAtoI(s));
    }
}
