package com.programmers.codingtest.level0;

public class exam17 {
    public static void main(String[]args){
        int number = 60;
        int n = 2;
        int m = 3;

        solution(number,n,m);
    }
    public static int solution(int number, int n, int m) {
        int answer = 0;

        if((number % n == 0) && (number % m == 0)){
            answer = 1;
        }else{
            answer = 0;
        }
        System.out.println("answer = " + answer);
        return answer;
    }
}
