package com.programmers.codingtest.level0;

public class exam11 {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "b";
        System.out.println(solution(str1, str2));
    }

    public static String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
        }
        return answer;
    }
}
