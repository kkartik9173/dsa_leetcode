package main.java.LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {

    private List<Integer> retrieveSpiralOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        ArrayList<Integer> spiralOrderMatrix = new ArrayList<>();

        // Initialize boundaries
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        // Iterate until all elements are printed
        while (top <= bottom && left <= right) {

            // Print top row from left to right
            for (int i = left; i <= right; i++) {
                spiralOrderMatrix.add(mat[top][i]);
            }
            top++;

            // Print right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                spiralOrderMatrix.add(mat[i][right]);
            }
            right--;

            // Print bottom row from right to left (if exists)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiralOrderMatrix.add(mat[bottom][i]);
                }
                bottom--;
            }

            // Print left column from bottom to top (if exists)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiralOrderMatrix.add(mat[i][left]);
                }
                left++;
            }
        }

        return spiralOrderMatrix;
    };

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        int[][] matrix1 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };
        SpiralMatrix54 spiralMatrix = new SpiralMatrix54();

        List<Integer> spiralOrderMatrix= spiralMatrix.retrieveSpiralOrder(matrix1);
        for(int i:spiralOrderMatrix){
            System.out.println("final " + i);
        }
    }


}
