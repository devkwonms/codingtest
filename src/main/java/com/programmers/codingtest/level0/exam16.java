package com.programmers.codingtest.level0;

public class exam16 {
    public static void main(String[] args) {

        int num = 98;
        int n = 2;

        solution(num, n);
    }

    public static int solution(int num, int n) {
        if(num % n == 0){
            return 1;
        }else{
            return 0;
        }
    }
}
