package main.java.LeetCode.Medium;

public class IslandCount200 {

    private int getIslandCount(char[][] grid) {

        int islandCount = 0;
        if(grid.length == 0) return 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1'){
                    islandCount =islandCount + 1;
                    countIslandRecursively(grid, i, j);
                }
            }
        }

        return islandCount;
    }

    private void countIslandRecursively(char[][] grid, int i, int j) {
        if(i<0 || j<0|| i>=grid.length || j>=grid[0].length || grid[i][j]!='1') return;

        grid[i][j]='x';

        countIslandRecursively(grid, i+1, j);
        countIslandRecursively(grid, i, j+1);
        countIslandRecursively(grid, i-1, j);
        countIslandRecursively(grid, i, j-1);
    }

    public static void main(String[] args) {
        char[][] matrix = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        char[][] matrix1 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
    IslandCount200 islandCount = new IslandCount200();
        System.out.println(islandCount.getIslandCount(matrix1));

    }


}
