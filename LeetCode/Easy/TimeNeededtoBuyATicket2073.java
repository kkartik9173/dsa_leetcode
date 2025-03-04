package main.java.LeetCode.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededtoBuyATicket2073 {

    private static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for (int c = 0; c < tickets.length; c++) {
            if(c<=k) {
                time = time + Math.min(tickets[c], tickets[k]);
            } else
                time = time + Math.min(tickets[c], tickets[k] -1);

        }
        return time;
    }

    public static void main(String[] args) {
        int[] tickets = {2,3,2}; int k = 0;
        int[] tickets1 = {5,1,1,1,};
        int time = TimeNeededtoBuyATicket2073.timeRequiredToBuy(tickets1, k);
        System.out.println(time);
    }


}
