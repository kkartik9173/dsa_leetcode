package main.java.LeetCode.Medium.Heap;

import java.util.Arrays;

public class TaskScheduler621 {

    public int leastInterval(char[] tasks, int n) {

        int taskLength = tasks.length;
        int[] count = new int[26];

        for (int i = 0; i < taskLength; i++) {
            count[tasks[i] -'A']++;
        }

        Arrays.sort(count);
        int maxFreq = count[25];
        int idleTime = (maxFreq - 1) * n; //4, if max is 3 and n is 2
        for (int i=24; i>=0 ; i--) {
            idleTime -= Math.min(maxFreq - 1, count[i]);
        }

        idleTime = Math.max(0, idleTime);
        System.out.println("idleTIme " + idleTime);

    return taskLength + idleTime;
    }

    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        TaskScheduler621 taskScheduler
                = new TaskScheduler621();
        int output = taskScheduler.leastInterval(tasks, 2);
        System.out.println(output);


    }
}
