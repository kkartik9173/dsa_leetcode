package main.java.LeetCode.Medium;

import java.util.Arrays;

public class RotateImage48 {

    //Transpose the matrix by swapping elements along the main diagonal, then symmetrically flip it for the desired rotation.
    //After transpose, it will be swap(matrix[i][j], matrix[j][i])
    //Then flip the matrix horizontally. (swap(matrix[i][j], matrix[i][matrix.length-1-j])
// Transpose Step:
//    The transpose method swaps the elements across the main diagonal of the matrix.
//    It iterates through the upper triangle of the matrix (matrix[i][j] and matrix[j][i]) and exchanges the values.
//Reverse Rows Step:
//    The reverseRows method then reverses each row of the transposed matrix.
//    For each row (matrix[r]), it uses two pointers (left and right) to swap elements symmetrically across the center.
//Combination in rotate Method:
//    The rotate method combines these two steps to achieve a 90-degree clockwise rotation.
//    It first transposes the matrix and then reverses the rows of the transposed matrix.
    private void transpose(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=i; j<matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private void reverseRows(int[][] matrix) {
        for(int r=0; r<matrix.length; r++) {
            int left = 0;
            int right = matrix.length-1;

            while(left < right) {
                int temp = matrix[r][left];
                matrix[r][left] = matrix[r][right];
                matrix[r][right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRows(matrix);

    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},   //3,1     741
                {4,5,6},    //4,2    852
                {7,8,9}            //963
        };

        RotateImage48 ri = new RotateImage48();
        ri.rotate(matrix);

    }
}
