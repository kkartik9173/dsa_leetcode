package main.java.LeetCode.Medium;

import java.math.BigInteger;

public class MultiplyString43 {

    public String multiply(String num1, String num2) {
        if(num1.isEmpty() && num2.isEmpty())
            return "";

        Long mul = Long.parseLong(num1) * Long.parseLong(num2);

        return String.valueOf(mul);

    }
    public static String multiply1(String num1, String num2) {
        return String.valueOf((new java.math.BigInteger(num1)).multiply(new java.math.BigInteger(num2)));
    }

    public static void main(String[] args) {
        String num1 = "498828660196";
        String num2 = "840477629533";
        MultiplyString43 mul = new MultiplyString43();
        System.out.println(mul.multiply1(num1, num2));
    }
}
