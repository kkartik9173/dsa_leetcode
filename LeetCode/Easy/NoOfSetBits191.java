package main.java.LeetCode.Easy;

public class NoOfSetBits191 {



    public int hammingWeight(int n) {

//        String binaryString = Integer.toBinaryString(n);
//        System.out.println(Integer.toBinaryString(n));
//        int count = 0;
//        for (int i = 0; i <  binaryString.length(); i++) {
//            char c = binaryString.charAt(i);
//            if(Integer.parseInt(String.valueOf(binaryString.charAt(i))) == 1)
//                count++;
//        }
//
//        System.out.println(count);
//        return count;

        int count = 0;
        while(n > 0){
            if((n & 1) == 1) count++;
            n = n >> 1;
        }

        return count;
    }

    public static void main(String[] args) {
        NoOfSetBits191 n = new NoOfSetBits191();

        n.hammingWeight(3);
    }

}
