package main.java.LeetCode;

public class BinarySum67 {

    public String addBinary(String a, String b) {
        
        StringBuilder resultString = new StringBuilder();
        int i = a.length() - 1; int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry == 1 ){
            int temp = carry;
            int x = carry;
            if(i >=0) temp+= a.charAt(i--) - '0';
            if(j >=0) temp+= a.charAt(j--) - '0';

            resultString.append(temp%2);
            carry = temp/2;
        }

        return resultString.reverse().toString();
    }

    public static void main(String[] args) {
        BinarySum67 binary = new BinarySum67();
        String s = binary.addBinary("101", "111");
        System.out.println(s);

    }

}
