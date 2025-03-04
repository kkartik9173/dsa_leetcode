package main.java.LeetCode.Medium;

public class ReverseInteger7 {
    public static void main(String[] args) {
        ReverseInteger7 reverseInteger
                =new ReverseInteger7();

        reverseInteger.reverse(123);
    }

    private int reverse(int i) {
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;

        long revNum = 0;

        while(i !=0){
            int rem = i%10;
            revNum = revNum *10 + rem;
            i = i/10;
        }
        if(revNum > INT_MAX || revNum < INT_MIN){
            return 0;
        }
        return (int) revNum;
    }
}
