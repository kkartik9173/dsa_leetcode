package main.java.LeetCode.Easy;

public class StringSwapEqual1790 {
    private boolean stringSwap(String s1, String s2) {
        int mismatchCount = 0;

        // Initialize variables to store characters from non-matching character pairs.
        char firstCharFromS1 = 0, firstCharFromS2 = 0;

        // Iterate over the strings to compare characters at each index.
        for (int i = 0; i < s1.length(); ++i) {
            // Get the current characters from each string.
            char charFromS1 = s1.charAt(i), charFromS2 = s2.charAt(i);

            // Check for non-matching characters
            if (charFromS1 != charFromS2) {

                // If more than two non-matching pairs, strings are already not almost equal.
                if (++mismatchCount > 2 ||
                        // If this is the second mismatch but does not form a transposable pair with the first mismatch, return false.
                        (mismatchCount == 2 && !(charFromS1 == firstCharFromS2 && charFromS2 == firstCharFromS1))) {
                    return false;
                }
                // Store the characters from the first non-matching character pair.
                firstCharFromS1 = charFromS1;
                firstCharFromS2 = charFromS2;
            }
        }
        // If there is exactly one mismatch, strings cannot be made equal by a single swap.
        // Strings are almost equal if there were zero or two mismatches.
        return mismatchCount != 1;
    }

    public static void main(String[] args) {
        String s1= "bank";
        String s2= "kanb";

        StringSwapEqual1790 stringSwapEqual = new StringSwapEqual1790();
        boolean result = stringSwapEqual.stringSwap(s1, s2);
        System.out.println(result);
    }


}
