package com.programmers.codingtest.level1;

import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {

        int sum = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            String workGotoTime = sc.next();
            String workLeavetoTime = sc.next();

            int workGotoHour = Integer.parseInt(workGotoTime.substring(0, 2));
            int workLeavetoHour = Integer.parseInt(workLeavetoTime.substring(0, 2));

            int workHour = workLeavetoHour - workGotoHour;

            int workGotoMinute = Integer.parseInt(workGotoTime.substring(3, 5));
            int workLeavetoMinute = Integer.parseInt(workLeavetoTime.substring(3, 5));

            int workMinute = workLeavetoMinute - workGotoMinute;

            int totalWorktime = (workHour * 60) + workMinute;

            sum += totalWorktime;
        }
        System.out.println(sum);
        sc.close();
    }
}
