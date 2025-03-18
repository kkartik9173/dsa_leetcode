package main.java.LeetCode.Medium;

import java.util.Arrays;

public class RotateImage48Copy {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},   //3,1     741
                {4,5,6},    //4,2    852
                {7,8,9}            //963
        };

        RotateImage48Copy ri = new RotateImage48Copy();
        ri.rotate(matrix);

    }

    private void rotate(int[][] matrix) {
        transpose(matrix);
        reverseMatrix(matrix);
    }

    private void reverseMatrix(int[][] matrix) {
        for(int r=0; r< matrix.length; r++){
            int left = 0;
            int right = matrix[0].length-1;

            while(left<right){
                int temp = matrix[r][left];
                matrix[r][left] = matrix[r][right];
                matrix[r][right] = temp;

                left++;
                right--;
            }

        }
        System.out.println(Arrays.deepToString(matrix));
    }

    private void transpose(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j =i; j<matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
