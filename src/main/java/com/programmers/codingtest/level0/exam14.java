package com.programmers.codingtest.level0;

public class exam14 {
    public static void main(String[]args){
        int a = 1;
        int b = 23;
        solution(a,b);
    }

    public static int solution(int a, int b) {

        int answer = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        // a 와 b 의 범위설정
        if((a >= 1 && a < 10000) && (b >= 1 && b < 10000)){
            sb1 = sb1.append(a).append(b);
            sb2 = sb2.append(b).append(a);

            int num1 = Integer.parseInt(sb1.toString());
            int num2 = Integer.parseInt(sb2.toString());

            if((num1 > num2) || (num1 == num2)){
                answer = num1;
            }else if(num1 < num2){
                answer = num2;
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }
}
