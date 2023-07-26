package com.programmers.codingtest.level0;

public class exam20 {
    public static void main(String[] args) {
        solution(-4, 7, true);
        solution(-4, 7, false);

    }

    public static int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag) {
            answer = a + b;
        } else {
            answer = a - b;
        }
        System.out.println(answer);
        return answer;
    }
}
