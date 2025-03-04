package main.java.LeetCode.Easy;

public class MinimumTimeVisitingAllPoint1266 {
    //{1,1}, 0 0 to 0,1 //row1
    //{3,4}, 1,0 to 1,1 //row2
    //{-1,0} 2,0 to 2,1//row3
    public int minimumTime(int[][] nums) {
        int minimumTime=0;

        int[] p1= nums[0];
        for (int i = 1; i < nums.length; ++i) {

            int[] p2 = nums[i];
            int x =p2[0] - p1[0];
            int y =p2[1] - p1[1];

            minimumTime+= Math.max(Math.abs(x), Math.abs(y));
            p1=p2;

        }

        return minimumTime;
    }

    public static void main(String[] args) {
        int[][] intArray = {{1,1},{3,4},{-1,0}};
        //int[][] intArray = {{3,2},{-2,2}};
        
        MinimumTimeVisitingAllPoint1266 minimumTimeVisitingAllPoint = new MinimumTimeVisitingAllPoint1266();
        int minimumTime= minimumTimeVisitingAllPoint.minimumTime(intArray);
        System.out.println("minimumTime "+ minimumTime);
    }
}
