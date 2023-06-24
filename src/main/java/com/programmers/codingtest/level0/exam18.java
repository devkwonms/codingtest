package com.programmers.codingtest.level0;

public class exam18 {
    public static void main(String[]args){
        int n = 10;
        solution(n);
    }

    public static int solution(int n) {
        int answer = 0;

        if(n % 2 == 1){
            for(int i = 1; i < n+1; i++){
                if(i % 2 == 1) {
                    answer += i;
                }else{
                    continue;
                }
            }
        }else if(n % 2 == 0){
            for(int i = 1; i < n+1; i++){
                if(i % 2 == 0){
                    answer += (int)Math.pow(i,2);
                }else{
                    continue;
                }
            }
        }
        return answer;
    }
}
