package com.programmers.codingtest.level0;

public class exam15 {
    public static void main(String[] args) {
        int a = 2;
        int b = 91;

        solution(a, b);
    }

    public static int solution(int a, int b) {
        return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)), 2 * a * b);
    }
}
