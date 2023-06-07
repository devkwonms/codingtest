package com.programmers.codingtest.level0;

import java.util.Scanner;

public class exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        // str의 길이 변수 초기화
        int a = str.length();

        // a 의 길이제한 , n의 크기제한 조건문으로 설정
        if((a >= 1 && a <= 10 )&&(n >=1 && n <=5)){
            for(int i = 0; i <n; i++){
                System.out.print(str);
            }
        }
        // scanner 자원 닫아주기
        sc.close();
    }
}
