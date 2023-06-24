package com.programmers.codingtest.level0;

public class exam17 {
    public static void main(String[]args){
        int number = 60;
        int n = 2;
        int m = 3;

        solution(number,n,m);
    }
    public static int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
