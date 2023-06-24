package com.programmers.codingtest.level0;

public class exam15 {
    public static void main(String[] args) {
        int a = 91;
        int b = 2;

        solution(a, b);
    }

    public static int solution(int a, int b) {
        int answer = 0;

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        int num1 = Integer.parseInt(sb1.append(a).append(b).toString());
        int num2 = Integer.parseInt(sb2.append(a).toString()) * Integer.parseInt(sb3.append(b).toString()) * 2;

        if ((num1 > num2) || (num1 == num2)) {
            answer = num1;
        } else if (num1 < num2) {
            answer = num2;
        }
        System.out.println("answer = " + answer);
        return answer;
    }
}
